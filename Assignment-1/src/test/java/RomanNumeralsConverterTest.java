import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {
    @ParameterizedTest
    @MethodSource("argumentsForRomanConverter")
    void mustConvertRomanNumeral(int input, String expected) {
        String result = RomanNumeralsConverter.intToRomanNumerals(input);
        assertEquals(result, expected);
    }

    private static Stream<Arguments> argumentsForRomanConverter() {
        return Stream.of(
                Arguments.of(1, "I"),
                Arguments.of(2, "II"),
                Arguments.of(-1, null)
        );
    }
}