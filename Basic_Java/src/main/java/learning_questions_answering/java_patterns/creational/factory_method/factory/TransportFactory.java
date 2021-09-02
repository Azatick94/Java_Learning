package learning_questions_answering.java_patterns.creational.factory_method.factory;

import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.Car;
import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.Ship;
import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.Transport;
import learning_questions_answering.java_patterns.creational.factory_method.entities.transport.TransportType;

public class TransportFactory implements AbstractFactory<Transport, TransportType> {

    @Override
    public Transport create(TransportType type) {
        if (type.equals(TransportType.Car)) {
            return new Car();
        } else if (type.equals(TransportType.Ship)) {
            return new Ship();
        }
        return null;
    }
}
