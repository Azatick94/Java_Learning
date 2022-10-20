package learning_questions_answering.java_hamcrest;

import org.hamcrest.core.AnyOf;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    * equalTo()
    * startsWithIgnoringCase()
    * startsWith()
    * endsWithIgnoringCase()
    * endsWith()

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








}
