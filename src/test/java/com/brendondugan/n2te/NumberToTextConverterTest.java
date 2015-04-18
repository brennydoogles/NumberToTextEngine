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
        assertTrue(converter.convertNumber(1).equalsIgnoreCase("one"));
        assertTrue(converter.convertNumber(21).equalsIgnoreCase("twenty one"));
        assertTrue(converter.convertNumber(105).equalsIgnoreCase("one hundred and five"));
        assertTrue(converter.convertNumber(56945781).equalsIgnoreCase("fifty six million nine hundred and forty five thousand seven hundred and eighty one"));
        
    }
}