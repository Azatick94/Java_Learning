package learning_questions_answering.java_generics.java_generics_and_collections.ch1_Introduction.createListFromArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCreation {

    public static void main(String[] args) {

        String[] arr1 = new String[]{"text", "sdf", "sdfsdf", "hello"};
        Integer[] arr2 = new Integer[]{1, 2, 3};

        List<String> list1 = convertArrayToList(arr1);
        List<Integer> list2 = convertArrayToList(arr2);

        // list 1
        list1.forEach(System.out::println);
        System.out.println();
        list2.forEach(System.out::println);
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> lst = new ArrayList<>();
        Collections.addAll(lst, array);
        return lst;
    }
}
