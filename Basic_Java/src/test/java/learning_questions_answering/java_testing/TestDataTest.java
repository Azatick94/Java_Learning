package learning_questions_answering.java_testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestDataTest {

    @Test
    public void testJUnit() {
        Integer expected = 1;
        assertEquals(expected, TestData.a);
    }

    @Test
    public void testAssertJ() {
        Integer expected = 1;
        assertThat(TestData.a).isEqualTo(expected);
    }


}