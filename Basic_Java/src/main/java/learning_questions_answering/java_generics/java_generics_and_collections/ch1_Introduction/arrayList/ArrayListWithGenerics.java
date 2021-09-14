package learning_questions_answering.java_generics.java_generics_and_collections.ch1_Introduction.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Hello");
        lst.add(" World");
        String s = lst.get(0) + lst.get(1);
        assert s.equals("Hello World");
    }
}
