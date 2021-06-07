package learning_questions_answering.java_streamAPI.parallel_stream;

import java.util.stream.Stream;

public class ParallelStreamExample2 {
    public static void main(String[] args) {

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "hello world");

        // работа с параллельным потоком. потом sequential - преобразование параллельного потока в последовательный
        String sentence = wordsStream.parallel()
                .filter(s->s.length()<10) // фильтрация над параллельным потоком
                .sequential()
                .reduce("Результат:", (x,y)->x + " " + y); // операция над последовательным потоком
        System.out.println(sentence);

    }
}
