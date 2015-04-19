package com.brendondugan.n2te;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToTextConverterTest {

    private NumberToTextConverter converter;

    @Before
    public void setUp() throws Exception {
        this.converter = new NumberToTextConverter();
    }

    @After
    public void tearDown() throws Exception {
        this.converter = null;
    }

    @Test
    public void testConvertNumber() throws Exception {
        assertEquals("Conversion works with single digit number", "one", converter.convertNumber(1));
        assertEquals("Conversion works with double digit number", "twenty one", converter.convertNumber(21));
        assertEquals("Conversion works with triple digit number", "one hundred and five", converter.convertNumber(105));
        assertEquals("Conversion works with extremely large numbers", "fifty six million nine hundred and forty five thousand seven hundred and eighty one", converter.convertNumber(56945781));
        assertEquals("Conversion properly handles the number 0", converter.convertNumber(0), "zero");

    }
}