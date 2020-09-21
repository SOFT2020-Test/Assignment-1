import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        double result = TemperatureConverter.convertCelsiusOrFahrenheit(41, "celsius");
        assertEquals(5.0, result);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        double result = TemperatureConverter.convertCelsiusOrFahrenheit(41, "fahrenheit");
        assertEquals(105.8, result);
    }

}