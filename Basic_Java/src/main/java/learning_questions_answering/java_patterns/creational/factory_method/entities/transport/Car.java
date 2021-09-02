package learning_questions_answering.java_patterns.creational.factory_method.entities.transport;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("I am delivering car");
    }
}
