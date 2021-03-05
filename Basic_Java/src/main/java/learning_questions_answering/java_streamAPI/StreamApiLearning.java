package learning_questions_answering.java_streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiLearning {

    public static void main(String[] args) {

        // №1 - creating list and performing manipulations
        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");
        mList.stream()
                .filter(x -> x.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


        System.out.println("---");

        // #2 - create list, convert String to integer, get max values.
        mList = Arrays.asList("1", "2.44", "5.6", "10.34");
        Optional<Double> max = mList.stream()
                .map(Double::parseDouble)
                .filter(x -> x<10.0)
                .sorted()
                .reduce(Double::max);
        System.out.println(max.get());

        System.out.println("---");

        // #3 - Filter dataset and Collect into List
        List<Integer> mList2 = Arrays.asList(1,5,10,15,20,100, 200, 1000);
        List<Double> result = mList2.stream()
                .filter(x -> x<=100)
                .sorted()
                .map(x -> Math.pow(x,2))
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("---");

        // #4 - Creating HashMap, order Map by values
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("five", 5);
        map.put("three", 3);
        map.put("ten", 10);

        map.keySet()
                .forEach(System.out::println);

        System.out.println("---");

        // learning Collectors.toMap method
        Map<Character, String> map3 = Stream.of(50, 54, 55)
                .collect(Collectors.toMap(
                        i->(char) i.intValue(),
                        i->String.format("<%d>",i)
                ));

        System.out.println("---");

        Map<String, Integer> map4 = Stream.of(50, 54, 55)
                .collect(Collectors.toMap(
                        i->i.toString()+"-val",
                        i->i
                ));

        System.out.println("---");

        Map<Integer, String> map5 = Stream.of(50, 55, 50, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i,
                        i -> String.format("<%d>", i),
                        (a, b) -> String.join(", ", a, b)
                ));

        System.out.println();



    }
}















