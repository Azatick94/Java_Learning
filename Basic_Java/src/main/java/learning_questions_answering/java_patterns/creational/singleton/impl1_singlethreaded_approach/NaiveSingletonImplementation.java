package learning_questions_answering.java_patterns.creational.singleton.impl1_singlethreaded_approach;

public class NaiveSingletonImplementation {

    public static void main(String[] args) {

        Singleton val1 = Singleton.getInstance("val1");
        Singleton val2 = Singleton.getInstance("val2");

        assert val1.equals(val2);
    }
}
