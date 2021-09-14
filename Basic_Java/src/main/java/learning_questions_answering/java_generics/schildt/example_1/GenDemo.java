package learning_questions_answering.java_generics.schildt.example_1;

public class GenDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(1);
        iOb.showType();

        Gen<String> strOb = new Gen<>("some_text");
        strOb.showType();
    }
}
