package com.brendondugan.n2te.util;

/**
 * Created by brendon on 4/17/2015.
 */
public class SingleDigitConverter implements DigitConverter {

    private String[] values = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    @Override
    public String convertDigit(int digit) throws IllegalArgumentException{
        if(digit > 9 || digit < 0){
            throw new IllegalArgumentException("SingleDigitConverter is intended to work on numbers between 0 and 9");
        }
        return values[digit];
    }
}
