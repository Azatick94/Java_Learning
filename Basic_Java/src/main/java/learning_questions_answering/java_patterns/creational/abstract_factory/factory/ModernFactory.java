package learning_questions_answering.java_patterns.creational.abstract_factory.factory;

import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Chair;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Sofa;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.modern.ModernChair;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.modern.ModernSofa;

public class ModernFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
