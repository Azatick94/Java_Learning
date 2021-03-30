package learning_questions_answering.java_hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class First_Hamcrest_ExampleTest {

    @Test
    public void testEquals() {
        ExampleClass example = new ExampleClass("example");
        ExampleClass example2 = new ExampleClass("example");

        assertThat(example, equalTo(example2));
    }
}