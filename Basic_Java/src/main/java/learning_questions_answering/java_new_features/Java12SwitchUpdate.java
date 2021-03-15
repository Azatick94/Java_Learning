package learning_questions_answering.java_new_features;

public class Java12SwitchUpdate {
    public static void main(String[] args) {

//        Comparing Switch old implementation with new implementation
        // simple switch example
        int a = 3;
        switchNewImplementation(a);
        switchOldImplementation(a);
    }

    public static void switchNewImplementation(int a) {
        System.out.println("New Implementation:");
        switch (a) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 5 -> System.out.println("This is Five");
            default -> System.out.println("Default value");
        }
    }

    public static void switchOldImplementation(int a) {
        System.out.println("Old Implementation:");
        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 5:
                System.out.println("This is Five");
                break;
            default:
                System.out.println("Default value");
        }
    }
}
