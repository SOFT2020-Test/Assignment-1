import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {
    @Test
    public void testIntToRoman() throws Exception {
        String result = RomanNumeralsConverter.intToRomanNumerals(10);
        assertEquals("X", result);
    }

    @Test
    public void testIntToRomanMinus() throws Exception {
        String result = RomanNumeralsConverter.intToRomanNumerals(-1);
        assertEquals(null, result);
    }


    @ParameterizedTest
    @MethodSource("argumentsForRomanConverter")
    void mustConvertRomanNumeral(int input, String expected) {
        String result = RomanNumeralsConverter.intToRomanNumerals(input);
        assertEquals(result, expected);
    }

    private static Stream<Arguments> argumentsForRomanConverter() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II")
        );
    }
}