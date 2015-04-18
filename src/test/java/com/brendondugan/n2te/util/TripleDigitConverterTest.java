package com.brendondugan.n2te.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripleDigitConverterTest {

    private TripleDigitConverter converter;

    @Before
    public void setUp() throws Exception {
        this.converter = new TripleDigitConverter();
    }

    @After
    public void tearDown() throws Exception {
        this.converter = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigit() throws Exception {
        assertEquals(converter.convertDigit(100), "one hundred");
        assertEquals(converter.convertDigit(205), "two hundred and five");
        assertEquals(converter.convertDigit(432), "four hundred and thirty two");
        assertEquals(converter.convertDigit(95), "ninety five");
        assertEquals(converter.convertDigit(7), "seven");
        converter.convertDigit(1000);
    }
}