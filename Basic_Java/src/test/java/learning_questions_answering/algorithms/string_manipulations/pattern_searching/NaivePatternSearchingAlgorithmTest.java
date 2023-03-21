package learning_questions_answering.algorithms.string_manipulations.pattern_searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static learning_questions_answering.algorithms.string_manipulations.pattern_searching.NaivePatternSearchingAlgorithm.searchSubstring;
import static org.junit.jupiter.api.Assertions.*;

class NaivePatternSearchingAlgorithmTest {

    @Test
    @DisplayName("")
    void searchSubstringTest() {

        String text = "atest btesting ";
        String subString = "test";

        int[] result = searchSubstring(text, subString).stream().mapToInt(Integer::intValue).toArray();
        int[] expectation = {1, 7};

        assertArrayEquals(expectation, result);

    }
}
