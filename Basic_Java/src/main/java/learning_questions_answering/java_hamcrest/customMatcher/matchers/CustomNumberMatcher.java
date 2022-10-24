package learning_questions_answering.java_hamcrest.customMatcher.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class CustomNumberMatcher extends TypeSafeDiagnosingMatcher<Integer> {

    @Override
    protected boolean matchesSafely(Integer intValue, Description description) {

        description.appendText("was ")
                .appendValue(intValue)
                .appendText(", which is not what we need");
        return (intValue > 5 && intValue <= 10 && intValue != 7);

    }

    @Override
    public void describeTo(Description description) {
        description.appendText("GreaterThan 5 and LessThanOrEqual to 10 and notEqual To 7");
    }

    public static CustomNumberMatcher isOurNumber() {
        return new CustomNumberMatcher();
    }
}
