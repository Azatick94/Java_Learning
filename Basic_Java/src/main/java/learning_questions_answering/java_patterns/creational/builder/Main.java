package learning_questions_answering.java_patterns.creational.builder;

public class Main {

    public static void main(String[] args) {

        Person.Builder builder1 = new Person.Builder("Alex")
                .address("address")
                .age(20)
                .email("testemail")
                .phoneNumber("111")
                ;
        Person.Builder builder2 = new Person.Builder("Sasha")
                .address("address2")
                .age(22)
                .email("testemail2")
                .phoneNumber("123")
                ;

        Person person1 = builder1.build();
        Person person2 = builder2.build();


        System.out.println("Person - 1");
        System.out.println(person1.toString());
        System.out.println("Person - 2");
        System.out.println(person2.toString());


    }


}
