package learning_questions_answering.java_patterns.creational.factory_method.factory;

public interface AbstractFactory<T, E> {
    T create(E type);
}
