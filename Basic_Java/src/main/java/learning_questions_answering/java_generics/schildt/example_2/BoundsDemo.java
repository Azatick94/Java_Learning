package learning_questions_answering.java_generics.schildt.example_2;

public class BoundsDemo {
    public static void main(String[] args) {

        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        System.out.println(iob.average());

        Double[] fnums = {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dob = new Stats<>(fnums);
        System.out.println(dob.average());
    }
}
