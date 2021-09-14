package learning_questions_answering.java_generics.java_generics_and_collections.ch1_Introduction.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstBeforeGenerics {
    public static void main(String[] args) {
        List lst = new ArrayList();
        lst.add("Hello");
        lst.add(" World");

        String s = (String)lst.get(0) + lst.get(1);
        assert s.equals("Hello World");
    }
}
