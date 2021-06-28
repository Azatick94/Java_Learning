package learning_questions_answering.java_streamAPI.parallel_stream;

import java.util.stream.Stream;

public class ParallelStreamExample3 {
    public static void main(String[] args) {

        Person person1 = new Person("Azat", 26, Sex.MALE);
        Person person2 = new Person("Elina", 25, Sex.FEMALE);
        Person person3 = new Person("Azamat", 31, Sex.MALE);
        Person person4 = new Person("Dima", 20, Sex.MALE);
        Person person5 = new Person("Amir", 40, Sex.MALE);

        // parallel estimation of average Age of Male in List of People
        Stream<Person> stream = Stream.of(person1, person2, person3, person4, person5);
        double result = stream
                .parallel()
                .filter(p -> p.sex.equals(Sex.MALE))
                .mapToInt(p -> p.age)
                .peek(System.out::println)
                .average()
                .getAsDouble();
        System.out.println(result);

    }

    public static class Person {
        public String name;
        public Integer age;
        public Sex sex;

        public Person(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }


}
