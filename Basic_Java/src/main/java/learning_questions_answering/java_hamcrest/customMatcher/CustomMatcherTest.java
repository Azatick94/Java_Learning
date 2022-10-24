package learning_questions_answering.java_hamcrest.customMatcher;

import org.junit.jupiter.api.Test;

import static learning_questions_answering.java_hamcrest.customMatcher.matchers.CustomNameMatcher.isNameStartingWithAAAs;
import static learning_questions_answering.java_hamcrest.customMatcher.matchers.CustomNumberMatcher.isOurNumber;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CustomMatcherTest {

    @Test
    public void checkBetween5And10AndNot7() {
        int value = 6;
        assertThat(value, isOurNumber());
    }

    @Test
    public void checkStringForAAAs() {
        String text = "Asdfdfa";
        assertThat(text, isNameStartingWithAAAs());
    }

    @Test
    public void checkStringForAAAs2() {
        String text = "Asdfdf";
        assertThat(text, not(isNameStartingWithAAAs()));
    }

    @Test
    public void checkStringForAAAs3() {
        String text = "vvsasadAsdfdf";
        assertThat(text, not(isNameStartingWithAAAs()));
    }

}
