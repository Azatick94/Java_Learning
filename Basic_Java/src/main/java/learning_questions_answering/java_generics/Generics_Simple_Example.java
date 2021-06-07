package learning_questions_answering.java_generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Generics_Simple_Example {
    public static void main(String[] args) {

        Integer[] lstIntegers = {1,2,3,4,5,6};
        String[] lstStrings = {"1","2","3","4","5","6"};


        List<?> arrayListIntegers = fromArrayToList(lstIntegers);
        arrayListIntegers.forEach(System.out::print);

        System.out.println("\n");
        List<?> arrayListStrings = fromArrayToList(lstStrings);
        arrayListStrings.forEach(System.out::print);


    }

    // convert Array to List
    public static <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }


}
