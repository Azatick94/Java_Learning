package learning_questions_answering.java_streamAPI;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;

public class StreamsLearningWithEasyJava {

    // Link is here:
    // https://easyjava.ru/java/yazyk-java/

    public static void main(String[] args) {

        // 1) https://easyjava.ru/java/language/hello-streams/

        // Задача:  отобрать все слова, длиной в 5 знаков и объединить результат в строку, разделяя слова запятой.
        final List<String> LONG_WELCOME = Arrays
                .asList("Hello", "and", "welcome", "to", "the", "wonderful", "world", "of", "java", "8");
        // Решение
        final int WORD_LENGTH = 5;
        String collect = LONG_WELCOME.stream()
                .filter(t -> t.length() > WORD_LENGTH)
                .collect(Collectors.joining(", "));
        System.out.println(collect);


        // 3) https://easyjava.ru/java/java8-foreach-i-kollekcii/
        // Задача
        Collection<String> upper = new ArrayList<>();
        LONG_WELCOME.forEach(s -> upper.add(s.toUpperCase()));
        upper.forEach(System.out::println);

        // 6) https://easyjava.ru/java/language/java-8-stream-api-chast-shestaya-sobstvennyj-kollektor/
        // https://blog.indrek.io/articles/creating-a-collector-in-java-8/
        // grouping BY
        Map<String, Long> counted = LONG_WELCOME.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(counted);

        Map<Boolean, List<String>> collect1 = LONG_WELCOME.stream().
                collect(Collectors.partitioningBy(b -> b.length() > 5));
        System.out.println(collect1);


        // 4) Подготовка данных для гистограммы.


    }


}
