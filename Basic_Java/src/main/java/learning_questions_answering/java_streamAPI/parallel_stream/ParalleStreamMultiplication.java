package learning_questions_answering.java_streamAPI.parallel_stream;

import java.util.stream.Stream;

public class ParalleStreamMultiplication {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Integer result = integerStream
                .parallel()
                .filter(n -> n > 5)
                .peek(System.out::println)
                .reduce(1, (x, y) -> x * y);
        System.out.println("Result: " + result);

    }
}
