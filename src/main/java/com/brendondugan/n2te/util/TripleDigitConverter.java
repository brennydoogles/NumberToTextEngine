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

        return null;
    }
}
