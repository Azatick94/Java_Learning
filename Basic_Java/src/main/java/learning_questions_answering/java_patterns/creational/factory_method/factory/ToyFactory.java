package learning_questions_answering.java_patterns.creational.factory_method.factory;

import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.BearToy;
import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.Doll;
import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.Toy;
import learning_questions_answering.java_patterns.creational.factory_method.entities.toys.ToyTypes;

public class ToyFactory implements AbstractFactory<Toy, ToyTypes> {
    @Override
    public Toy create(ToyTypes type) {
        if (type.equals(ToyTypes.Doll)) {
            return new Doll();
        } else if (type.equals(ToyTypes.Bear)) {
            return new BearToy();
        }
        return null;
    }
}
