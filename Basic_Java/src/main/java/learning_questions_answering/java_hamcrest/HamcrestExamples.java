package learning_questions_answering.java_hamcrest;

import org.hamcrest.Matchers;
import org.hamcrest.core.AnyOf;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestExamples {

    // Example of simple String comparison
    @Test
    public void givenString_whenEqual_thenCorrect() {
        String name = "Alex";
        assertThat(name, equalTo("Alex"));
    }

    /*
    LOGICAL MATCHERS

    COMMON EXPRESSIONS:
    * allOf() - И
    * anyOf() - ИЛИ
    * not() - НЕ

    STRING COMPARISON MATCHERS:
    * containsString()
    * startsWithIgnoringCase()
    * startsWith()
    * endsWithIgnoringCase()
    * endsWith()
    * equalTo()
    * equalToIgnoringWhiteSpace()

     */


    @Test
    public void checkTwoConditionsAndCondition() {
        // check that contains 'san' & starts with 'al'
        List<String> lst = List.of("Alexsandr", "Aliresan", "Almadegalana");
        AnyOf<String> matcher = anyOf(containsString("san"), startsWithIgnoringCase("al"));
        lst.forEach((name) -> assertThat(name, matcher));
    }

    @Test
    public void checkAnyCondition() {
        // check if equals to basketball or tennis
        assertThat("tennis", anyOf(equalTo("basketball"), equalTo("tennis")));
        assertThat("basketball", anyOf(equalTo("basketball"), equalTo("tennis")));
    }

    @Test
    public void checkNotEqualTo() {
        assertThat("word", not(equalTo("bad word")));
    }


    @Test
    public void checkEqualsIgnoringWhiteSpaces() {
        assertThat(" Hello    World    ", equalToIgnoringWhiteSpace("Hello World"));
    }

    /*

    NUMBERS COMPARISON MATCHERS
    * greaterThan()
    * greaterThanOrEqualTo()
    * lessThan()
    * lessThanOrEqualTo()
    * equalTo()


     */

    @Test
    public void checkNumberBetweenTwoNumbers() {
        // check x>5, x<20 & x!=7
        assertThat(10, allOf(lessThan(20), greaterThan(5), not(equalTo(7))));
    }

    /*
    DOUBLES COMPARISON
    * closeTo() - compares value with some uncertainty
     */

    @Test
    public void checkDoubleValue() {
        Double aDouble = 7.7001;
        assertThat(aDouble, closeTo(7.7, 0.05));
    }


    /*
    COLLECTIONS MATCHERS

    * empty()
    * hasSize()
    * greaterThan()
    * hasItem()
    * contains()
    * containsInAnyOrder()
     */

    @Test
    public void checkListIsNotEmpty() {
        assertThat(Arrays.asList(5, 2, 4), is(not(empty())));
    }

    @Test
    public void checkListHasSize() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
    }

    @Test
    public void checkArrayHasValue() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasItem(5));
    }

    @Test
    public void checkArrayHasValue2() {
        List<String> list = Arrays.asList("text", "text2", "hello");
        assertThat(list, hasItem("hello"));
    }

    @Test
    public void checkThatArrayContainsItems() {
        List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, containsInAnyOrder(5, 4, 2));
    }

    /*
    MAP MATCHERS

    * hasKey()
    * hasValue()
    * hasEntry()

     */

    @Test
    public void checkMapHas() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        assertThat(map, hasKey(1));
        assertThat(map, hasValue("a"));
        assertThat(map, hasEntry(3, "c"));
    }

    /*
    ARRAY MATCHERS
    * emptyArray()
    * arrayWithSize()
    * arrayContaining()
    * arrayContainingInAnyOrder()
    * hasItemInArray()

     */

    @Test
    public void checkArrayWithSize() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, arrayWithSize(3));
    }

    @Test
    public void checkArrayHasItem() {
        Integer[] array = new Integer[]{5, 2, 4};
        assertThat(array, hasItemInArray(5));
    }

    /*
    OBJECT MATCHERS
    * hasToString() - check that toString equals to certain value
    * typeCompatibleWith() - check that object is instance certain class or it's successor
    * hasProperty() - appropriate only for Java Beans (should have getters and setters)

     */

    public class Animal {
        protected String sound;

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        public Animal(String sound) {
            this.sound = sound;
        }
    }

    public class Dog extends Animal {
        public Dog(String sound) {
            super(sound);
        }

        public String toString() {
            return this.sound;
        }
    }


    @Test
    public void givenDog_whenToString_thenReturnsSound() {
        Dog dog = new Dog("gaf");
        assertThat(dog, hasToString("gaf"));
    }

    @Test
    public void givenBean_whenCheckProperty_thenHas() {
        Animal animal = new Animal("gaf");
        Dog dog = new Dog("gaf");
        assertThat(animal, Matchers.hasProperty("sound"));
        assertThat(dog, Matchers.<Animal> hasProperty("sound"));
    }

}
