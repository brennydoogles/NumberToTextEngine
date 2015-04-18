package com.brendondugan.n2te.util;

/**
 * Created by brendon on 4/17/2015.
 */
public class TripleDigitConverter implements DigitConverter {
    @Override
    public String convertDigit(int digit) {
        if(digit > 999 || digit < 0){
            throw new IllegalArgumentException("TripleDigitConverter is intended to work on numbers between 0 and 999");
        }
        int hundredsPlace = digit / 100;
        int remainder = digit % 100;
        if(hundredsPlace > 0){
            if(remainder > 0){
                return String.format("%s hundred and %s", new SingleDigitConverter().convertDigit(hundredsPlace), new DoubleDigitConverter().convertDigit(remainder)).trim();
            }
            return String.format("%s hundred", new SingleDigitConverter().convertDigit(hundredsPlace)).trim();

        }
        return new DoubleDigitConverter().convertDigit(remainder).trim();
    }
}
