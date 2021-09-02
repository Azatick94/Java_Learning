package learning_questions_answering.java_patterns.creational.abstract_factory;

import learning_questions_answering.java_patterns.creational.abstract_factory.factory.AbstractFactory;
import learning_questions_answering.java_patterns.creational.abstract_factory.factory.JapaneseFactory;
import learning_questions_answering.java_patterns.creational.abstract_factory.factory.ModernFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // lets create order of some customer
        AbstractFactory japaneseFactory = new JapaneseFactory();
        AbstractFactory modernFactory = new ModernFactory();


        // order №1, client wants to order chair from japanese kitchen
        List<Object> order1 = new ArrayList<>();
        order1.add(japaneseFactory.createChair());

        // order № 2, client wants chair + sofa from japanese + chair from modern
        List<Object> order2 = new ArrayList<>();
        order2.add(japaneseFactory.createChair());
        order2.add(japaneseFactory.createSofa());
        order2.add(modernFactory.createChair());




    }
}
