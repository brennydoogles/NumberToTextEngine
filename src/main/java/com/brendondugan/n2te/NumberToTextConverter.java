package com.brendondugan.n2te;

import com.brendondugan.n2te.util.DigitConverter;
import com.brendondugan.n2te.util.TripleDigitConverter;

/**
 * Created by brendon on 4/17/2015.
 */
public class NumberToTextConverter {

    private DigitConverter converter;

    public NumberToTextConverter() {
        converter = new TripleDigitConverter();
    }

    public String convertNumber(int input) {
        if (input == 0) {  // Only in the case of the original input being zero do we want to return anything other than
            return "zero"; // an empty String, so let's just handle that specific case
        }
        return doConversion(input);
    }

    private String doConversion(int input) {
        try {
            int millionsGroup = input / 1000000;
            input %= 1000000;
            int thousandsGroup = input / 1000;
            int hundredsGroup = input % 1000;
            if (millionsGroup > 0) {
                return String.format("%s million %s", converter.convertDigit(millionsGroup), convertNumber(input)).trim();
            }
            if (thousandsGroup > 0) {
                return String.format("%s thousand %s", converter.convertDigit(thousandsGroup), convertNumber(hundredsGroup)).trim();
            }
            if (hundredsGroup > 0) {

                return String.format("%s", converter.convertDigit(hundredsGroup)).trim();
            }
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return "";
    }
}
