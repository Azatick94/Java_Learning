package learning_questions_answering.algorithms.string_manipulations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperReducingStringTest {

    @ParameterizedTest
    @MethodSource("inputOutputProvider")
    @DisplayName("Test with Multiple Input Values")
    void superReducedString(String input, String expected) {

        String result = SuperReducingStringHackerRank.superReducedString(input);
        assertEquals(expected, result);

    }

    private static Collection<Object[]> inputOutputProvider() {
        return Arrays.asList(new Object[][] {
                {"a", "a"},
                {"aa", "Empty String"},
                {"baab", "Empty String"},
                {"aaabccddd", "abd"}
        });
    }
}
