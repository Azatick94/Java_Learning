package learning_questions_answering.java_patterns.creational.singleton.impl1_singlethreaded_approach;

import java.util.Objects;

public class Singleton {
    private static Singleton instance;
    private final String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Singleton singleton = (Singleton) o;
        return Objects.equals(value, singleton.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "value='" + value + '\'' +
                '}';
    }
}
