package learning_questions_answering.java_streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxValueFromArrayExample {
    public static void main(String[] args) {

        List<Integer> lstNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = lstNumbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(null);
        System.out.println(max);
    }
}
