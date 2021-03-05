package learning_questions_answering.java_streamAPI.effective_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeforeAndWithStreamsExample {

    public static void main(String[] args) {

        List<String> words = new ArrayList();
        words.add("sample");
        words.add("test");
        words.add("demo");
        words.add("teacher");
        words.add("breach");
        words.add("memory");
        words.add("school");

        // anonymous class creating to sort algos
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        words.forEach(System.out::println);

        System.out.println("\n---");
        // with streams
        List<String> words2 = new ArrayList();
        words2.add("sample");
        words2.add("test");
        words2.add("demo");
        words2.add("teacher");
        words2.add("breach");
        words2.add("memory");
        words2.add("school");


        Collections.sort(words2, (w1, w2) -> Integer.compare(w1.length(), w2.length())) ;
        // alternative way of writing
//        Collections.sort(words2, Comparator.comparingInt(String::length)) ;
        words2.forEach(System.out::println);




    }





}
