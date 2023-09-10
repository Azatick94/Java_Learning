package learning_questions_answering.java_testing.junit_rule_annotation;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class CustomRule implements TestRule {

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                // Code to run before the test method
                System.out.println("Before test method: " + description.getMethodName());
                try {
                    base.evaluate(); // Run the test method
                } finally {
                    // Code to run after the test method (even if it fails)
                    System.out.println("After test method: " + description.getMethodName());
                }
            }
        };
    }
}
