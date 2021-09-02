package learning_questions_answering.java_patterns.creational.abstract_factory.factory;

import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Chair;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Sofa;

public interface AbstractFactory {
    Chair createChair();

    Sofa createSofa();
}
