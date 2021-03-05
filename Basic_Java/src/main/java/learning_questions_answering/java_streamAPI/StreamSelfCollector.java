package learning_questions_answering.java_streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSelfCollector {

    public static void main(String[] args) {
        // calculate averages
        List<String> lst = new ArrayList<>(Arrays.asList("5", "34.5", "2.4", "4", "10.234"));

        System.out.println("---");
        System.out.println("Calculating Averages");
        Double result = lst.stream()
                .mapToDouble(Double::parseDouble)
                .average()
                .getAsDouble();
        System.out.println(result);

        //Accumulate the elements of a Stream using Collectors and Calculate averages
        System.out.println("---");
        System.out.println("Calculating Averages");
        Stream<Article> articles = Stream.of(
                new Article("Java article 1", "John"),
                new Article("Java article 2", "John"),
                new Article("Kotlin article 1", "Luke"),
                new Article("Kotlin article 2", "John")
        );

        OptionalDouble resultAvg = articles
                .mapToInt(x->x.getTitle().length())
                .average();
        if (resultAvg.isPresent())
            System.out.println(resultAvg.getAsDouble());
        articles.close();

        // Same operation but via method getTitleWordCount
        System.out.println("---");
        System.out.println("getTitleWordCount Counting");
        articles = Stream.of(
                new Article("Java article 1", "John"),
                new Article("Java article 2", "John"),
                new Article("Kotlin article 1", "Luke"),
                new Article("Kotlin article 2", "John")
        );
        Double resultAvgNew = articles.collect(Collectors.averagingDouble(Article::getTitleWordCount));
        System.out.println(resultAvgNew);

        //
        System.out.println("---");
        System.out.println("Joining articles and Print All Together.");
        articles = Stream.of(
                new Article("Java article 1", "John"),
                new Article("Java article 2", "John"),
                new Article("Kotlin article 1", "Luke"),
                new Article("Kotlin article 2", "John")
        );
        String resultJoined = articles.map(Article::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println("List of titles: "+resultJoined);



    }

    public static class Article {
        public String title;
        public String author;

        public Article(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public int getTitleWordCount() {
            return getTitle().length();
        }

        public String getTitle() {
            return title;
        }

    }



}
