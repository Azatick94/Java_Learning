package learning_questions_answering.sorting_algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Insertion_SortTest {

    @ParameterizedTest
    @MethodSource("inputOutputProvider")
    @DisplayName("Insertion Sort Test")
    void sortTest(int[] input, int[] expected) {

        int[] result = Insertion_Sort.sort(input);
        assertArrayEquals(expected, result);

    }

    private static Collection<Object[]> inputOutputProvider() {
        return Arrays.asList(new Object[][]{
                {new int[]{}, new int[]{}},
                {new int[]{1}, new int[]{1}},
                {new int[]{5, 2, 12, 12, 1}, new int[]{1, 2, 5, 12, 12}},
                {new int[]{5, 5, 2}, new int[]{2, 5, 5}},
                {new int[]{5, 5, 5}, new int[]{5, 5, 5}}

        });
    }
}
