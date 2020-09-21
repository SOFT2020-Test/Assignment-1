package main;

import junit.framework.TestCase;
import org.junit.Test;

public class RomanConverterTest extends TestCase {
    @Test
    public void testIntToRoman() throws Exception {
        String result = RomanConverter.intToRomanNumerals(10);
        assertEquals("X", result);
    }

    @Test
    public void testIntToRomanMinus() throws Exception {
        String result = RomanConverter.intToRomanNumerals(-1);
        assertEquals(null, result);
    }
}