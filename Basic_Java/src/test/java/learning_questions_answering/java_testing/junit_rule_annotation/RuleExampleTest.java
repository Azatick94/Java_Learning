package learning_questions_answering.java_testing.junit_rule_annotation;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Rule annotation exists only JUnit4.
 * in Junit5 it was replaced with @ExtendWith annotation where you specify class with additional functionality
 */
public class RuleExampleTest {

    @Rule
    public CustomRule customRule = new CustomRule();

    @Test
    public void testWithCustomRule() {
        int expectation = 10;
        int actual = 3 + 7;

        System.out.println("Main logic, actual = " + actual);
        assertEquals(expectation, actual);
    }


}
