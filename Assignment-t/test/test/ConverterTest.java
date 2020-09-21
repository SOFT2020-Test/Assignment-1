package test;

import junit.framework.TestCase;
import main.Converter;
import org.junit.Test;

public class ConverterTest extends TestCase {

    @Test
    public void testConvertFahrenheitToCelsius() {
        double result = Converter.convertCelsiusOrFahrenheit(41, "celsius");
        assertEquals(5.0, result);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        double result = Converter.convertCelsiusOrFahrenheit(41, "fahrenheit");
        assertEquals(105.8, result);
    }

    @Test
    public void testIntToRoman() throws Exception {
        String result = Converter.intToRomanNumerals(10);
        assertEquals("X", result);
    }

    @Test
    public void testIntToRomanMinus() throws Exception {
        String result = Converter.intToRomanNumerals(-1);
        assertEquals(null, result);
    }
}