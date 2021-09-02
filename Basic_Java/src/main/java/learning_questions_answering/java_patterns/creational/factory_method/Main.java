package learning_questions_answering.java_patterns.creational.factory_method;

import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.Toy;
import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.ToyTypes;
import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.Transport;
import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.TransportType;
import learning_questions_answering.java_patterns.creational.factory_method.factory.AbstractFactory;
import learning_questions_answering.java_patterns.creational.factory_method.factory.ToyFactory;
import learning_questions_answering.java_patterns.creational.factory_method.factory.TransportFactory;

public class Main {
    public static void main(String[] args) {

        // lets create some toys and transport
        // i want to create 1 car, 2 ships and 2 toys

        AbstractFactory<Transport, TransportType> transportFactory = new TransportFactory();
        AbstractFactory<Toy, ToyTypes> toyFactory = new ToyFactory();

        Transport car = transportFactory.create(TransportType.Car);
        Transport ship = transportFactory.create(TransportType.Ship);
        Transport ship2 = transportFactory.create(TransportType.Ship);

        Toy bear = toyFactory.create(ToyTypes.Bear);
        Toy doll = toyFactory.create(ToyTypes.Doll);

        car.deliver();
        ship.deliver();
        ship2.deliver();
        bear.play();
        doll.play();
    }
}
