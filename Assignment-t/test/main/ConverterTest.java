package main;

import junit.framework.TestCase;
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
}