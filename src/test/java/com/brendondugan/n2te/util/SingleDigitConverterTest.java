package com.brendondugan.n2te.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleDigitConverterTest {
    SingleDigitConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new SingleDigitConverter();
    }

    @After
    public void tearDown() throws Exception {
        converter = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigit() throws Exception {
        assertEquals(converter.convertDigit(0), "");
        assertEquals(converter.convertDigit(1), "one");
        assertEquals(converter.convertDigit(2), "two");
        assertEquals(converter.convertDigit(3), "three");
        assertEquals(converter.convertDigit(4), "four");
        assertEquals(converter.convertDigit(5), "five");
        assertEquals(converter.convertDigit(6), "six");
        assertEquals(converter.convertDigit(7), "seven");
        assertEquals(converter.convertDigit(8), "eight");
        assertEquals(converter.convertDigit(9), "nine");
        converter.convertDigit(10);
    }
}