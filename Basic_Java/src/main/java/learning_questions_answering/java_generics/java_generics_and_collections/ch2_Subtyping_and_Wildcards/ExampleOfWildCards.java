package learning_questions_answering.java_generics.java_generics_and_collections.ch2_Subtyping_and_Wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleOfWildCards {
    public static void main(String[] args) {

        // Collections addAll method supports wildcards

        List<Integer> lstIntegers = Arrays.asList(1,2,3);
        List<Double> lstDoubles = Arrays.asList(12.3, 234.1, 5.5);

        List<Number> lstFinal = new ArrayList<>();
        lstFinal.addAll(lstIntegers);
        lstFinal.addAll(lstDoubles);

        System.out.println("Example of wildcards usage");
        lstFinal.forEach(System.out::println);
    }
}
