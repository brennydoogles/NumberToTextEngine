package com.brendondugan.n2te.util;

/**
 * Created by brendon on 4/17/2015.
 */
public class DoubleDigitConverter implements DigitConverter {
    private String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private String[] tenIntervals = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    @Override
    public String convertDigit(int digit) {
        if(digit > 99 || digit < 0){
            throw new IllegalArgumentException("DoubleDigitConverter is intended to work on numbers between 0 and 99");
        }
        int tensPlace = digit / 10;
        int onesPlace = digit % 10;
        if(tensPlace == 1){
            return teens[onesPlace];
        }
        return String.format("%s %s", tenIntervals[tensPlace], new SingleDigitConverter().convertDigit(onesPlace)).trim();
    }
}
