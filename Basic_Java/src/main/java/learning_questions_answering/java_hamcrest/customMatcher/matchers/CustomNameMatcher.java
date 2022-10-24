package learning_questions_answering.java_hamcrest.customMatcher.matchers;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class CustomNameMatcher extends TypeSafeDiagnosingMatcher<String> {

    @Override
    protected boolean matchesSafely(String s, Description description) {

        if (!s.toLowerCase().startsWith("a")) {
            return false;
        }

        int counter = 0;
        String sLower = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char charAt = sLower.charAt(i);
            if (charAt == 'a') {
                counter++;
            }
        }

        return counter >= 2;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Should start with A and contain at Least 2 'A's ");
    }

    public static CustomNameMatcher isNameStartingWithAAAs() {
        return new CustomNameMatcher();
    }

}
