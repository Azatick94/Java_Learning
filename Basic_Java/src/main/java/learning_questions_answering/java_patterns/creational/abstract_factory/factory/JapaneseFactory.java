package learning_questions_answering.java_patterns.creational.abstract_factory.factory;

import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Chair;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.Sofa;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.japanese.JapaneseChair;
import learning_questions_answering.java_patterns.creational.abstract_factory.entities.japanese.JapaneseSofa;

public class JapaneseFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new JapaneseChair();
    }

    @Override
    public Sofa createSofa() {
        return new JapaneseSofa();
    }
}
