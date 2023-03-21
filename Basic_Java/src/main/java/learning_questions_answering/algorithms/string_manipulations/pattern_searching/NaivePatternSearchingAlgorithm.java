package learning_questions_answering.algorithms.string_manipulations.pattern_searching;

import java.util.ArrayList;
import java.util.List;

public class NaivePatternSearchingAlgorithm {

    public static void main(String[] args) {

        String pat = "AABAACAADAABAAABAA";
        String txt = "AABA";

        // Function call
        search(pat, txt);

    }

    /**
     * My Realization
     * Returns list of indexes where substring exists
     */
    public static List<Integer> searchSubstring(String text, String subString) {

        int pointerText = 0;
        int pointerSub = 0;
        int l1 = text.length();
        int l2 = subString.length();

        List<Integer> results = new ArrayList<>();

        while (pointerText < l1) {

            char item1 = text.charAt(pointerText);
            char item2 = subString.charAt(pointerSub);

            if (item1 != item2) {
                pointerText++;
                pointerSub = 0;
            } else {
                pointerText++;
                pointerSub++;

                // check if fully found, save result
                if (pointerSub >= l2) {
                    results.add(pointerText - l2);
                    pointerSub = 0;
                }

            }
        }
        return results;

    }

    /**
     * Realization from https://www.geeksforgeeks.org/naive-algorithm-for-pattern-searching/
     */
    static void search(String pat, String txt) {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;

        for (i = 0, j = l2 - 1; j < l1; ) {

            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index " + i);
            }
            i++;
            j++;
        }
    }


}
