package learning_questions_answering.java_testing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AssertJ_LearningMapDataTest {

    @Test
    public void testMapDataTrue() {
        assertThat(AssertJ_LearningMapData.map).containsValues("a", "b", "c");
    }

    @Test
    public void testMapDataFalse() {
        assertThat(AssertJ_LearningMapData.map).containsValues("a", "b", "z");
    }

}