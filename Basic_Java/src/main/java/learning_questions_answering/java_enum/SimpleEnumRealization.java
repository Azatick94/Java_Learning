package learning_questions_answering.java_enum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleEnumRealization {

    private final static Person person;

    static {
        person = new Person("Dima", Level.LEAD);
    }

    public enum Level {
        JUNIOR,
        MIDDLE,
        SENIOR,
        LEAD
    }

    public static class Person {
        private final String name;
        private final Level level;

        public Person(String name, Level level) {
            this.name = name;
            this.level = level;
        }

        public String getName() {
            return name;
        }

        public Level getLevel() {
            return level;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", level=" + level +
                    '}';
        }
    }

    @Test
    void testLevel() {
        assertEquals(Level.LEAD, person.getLevel());
    }

    @Test
    void testOrdinalNumber() {
        assertEquals(3, person.getLevel().ordinal());
    }
}
