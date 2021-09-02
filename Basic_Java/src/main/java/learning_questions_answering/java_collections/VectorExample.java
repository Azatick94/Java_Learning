package learning_questions_answering.java_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        List<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(5);

        System.out.println("Size: " + vector.size());
        vector.forEach(System.out::println);



    }
}
