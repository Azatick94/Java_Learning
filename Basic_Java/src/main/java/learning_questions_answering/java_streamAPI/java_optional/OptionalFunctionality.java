package learning_questions_answering.java_streamAPI.java_optional;

import java.util.Optional;

public class OptionalFunctionality {
    public static void main(String[] args) {

        //region 1) OPTIONAL INITIALIZATION EXAMPLES
        // Returns an Optional describing the given non-null value.
        Optional<String> opt1 = Optional.of("Test");

        //  Returns an Optional describing the given value, if non-null, otherwise returns an empty Optional.
        Optional<String> opt2 = Optional.ofNullable("sdf");

        // Returns an empty Optional instance. No value is present for this Optional.
        Optional<Object> opt3 = Optional.empty();
        //endregion

        //region 2) OPTIONAL CHECKS
        System.out.println("-".repeat(10));
        System.out.println("OPTIONAL CHECK!");

        Optional<String> optFunc1 = Optional.ofNullable("Test");
        Optional<String> optFunc2 = Optional.ofNullable(null);

        // If a value is present, performs the given action with the value, otherwise does nothing.
        optFunc1.ifPresent(v -> System.out.println("Value " +v));
        optFunc2.ifPresent(v -> System.out.println("Value " +v));
        System.out.println("-".repeat(10));

        // If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
        optFunc1.ifPresentOrElse(v -> System.out.println("Value " + v), () -> System.out.println("Value Not Present"));
        optFunc2.ifPresentOrElse(v -> System.out.println("Value " + v), () -> System.out.println("Value Not Present"));

        // If a value is not present, returns true, otherwise false.
        optFunc1.isEmpty();
        // If a value is present, returns true, otherwise false.
        optFunc1.isPresent();
        //endregion

        // OPTIONAL, orElse(), orElseGet()
        Optional<String> optOrElse = Optional.of("test");

        // If a value is present, returns the value, otherwise returns other.
        String replacement = optOrElse.orElse("Replacement");
        // If a value is present, returns the value, otherwise returns the result produced by the supplying function.
        optOrElse.orElseGet(() -> calc());

        // If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
        optOrElse.orElseThrow(() -> new RuntimeException("Element not Found"));

    }

    public static String calc() {
        return "Calculated value";
    }

}
