package com.brendondugan.n2te.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleDigitConverterTest {

    private DoubleDigitConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new DoubleDigitConverter();
    }

    @After
    public void tearDown() throws Exception {
        converter = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigit() throws Exception {
        assertEquals(converter.convertDigit(00), "");
        assertEquals(converter.convertDigit(10), "ten");
        assertEquals(converter.convertDigit(11), "eleven");
        assertEquals(converter.convertDigit(12), "twelve");
        assertEquals(converter.convertDigit(13), "thirteen");
        assertEquals(converter.convertDigit(14), "fourteen");
        assertEquals(converter.convertDigit(15), "fifteen");
        assertEquals(converter.convertDigit(16), "sixteen");
        assertEquals(converter.convertDigit(17), "seventeen");
        assertEquals(converter.convertDigit(18), "eighteen");
        assertEquals(converter.convertDigit(19), "nineteen");
        assertEquals(converter.convertDigit(20), "twenty");
        assertEquals(converter.convertDigit(31), "thirty one");
        assertEquals(converter.convertDigit(42), "forty two");
        assertEquals(converter.convertDigit(53), "fifty three");
        assertEquals(converter.convertDigit(64), "sixty four");
        assertEquals(converter.convertDigit(75), "seventy five");
        assertEquals(converter.convertDigit(86), "eighty six");
        assertEquals(converter.convertDigit(97), "ninety seven");
        converter.convertDigit(100);
    }
}