package learning_questions_answering.java_streamAPI;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekExample {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        /* Stream without terminal operation will not be calculated. So peek will not be performed
        stream
                .filter(e -> e > 3)
                .peek(e -> System.out.println("Element " + e));
        */

        stream
            .filter(e -> e > 3)
            .peek(e -> System.out.println("Element " + e))
            .collect(Collectors.toList());


    }
}
