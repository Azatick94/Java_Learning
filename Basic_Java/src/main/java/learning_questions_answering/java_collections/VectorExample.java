package learning_questions_answering.java_collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        /*
        Vector - is same dynamic array as ArrayList.
        The main differences are:
            * By default, Vector doubles the size of its array when its size is increased.
                 But, ArrayList increases by half of its size when its size is increased.
            * Vector's methods are synchronized and ArrayList's methods are not synchronized
         */


        List<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(5);

        System.out.println("Size: " + vector.size());
        vector.forEach(System.out::println);



    }
}
