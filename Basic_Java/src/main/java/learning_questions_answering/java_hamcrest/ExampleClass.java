package learning_questions_answering.java_hamcrest;

import java.util.Objects;

public class ExampleClass {
    String name;

    public ExampleClass(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExampleClass that = (ExampleClass) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ExampleClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
