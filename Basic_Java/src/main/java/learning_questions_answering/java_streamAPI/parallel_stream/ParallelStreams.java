package learning_questions_answering.java_streamAPI.parallel_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        long time11 = System.nanoTime();
        System.out.println("Using Simple Streams");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> list = stream
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        long time12 = System.nanoTime();

        long time21 = System.nanoTime();
        System.out.println("Using Parallel Streams");
        stream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> listParallel = stream
                .parallel()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        listParallel.forEach(System.out::println);
        long time22 = System.nanoTime();

        System.out.println("Simple Streams Time: " + (time12 - time11) / Math.pow(10, 9) + " seconds");
        System.out.println("Parallel Streams Time: " + (time22 - time21) / Math.pow(10, 9) + " seconds");
    }
}
