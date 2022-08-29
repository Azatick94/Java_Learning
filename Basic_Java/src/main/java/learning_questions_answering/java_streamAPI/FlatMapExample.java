package learning_questions_answering.java_streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {


        // The Stream flatMap() method is used to flatten a Stream of collections to a Stream of objects.
        // Stream.flatMap() helps in converting Stream<Collection<T>> to Stream<T>.

        // example
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> list = listOfLists.stream()
                .flatMap(lst -> lst.stream())
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
