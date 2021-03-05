package tim_learning;

import javax.sound.midi.Soundbank;

public class Learning_10_Studying_Methods {
    public static void main(String[] args) {

        // now, lets call method print_hello;
        print_hello();

        // now, the same way, but i am going to create sum function from calculator, which accepts 2 numbers and return the sum.
        sum2items(3, 5.1);


        // testing drive_is_allowed method
        System.out.println("Testing drive_is_allowed method");
        drive_is_allowed(10, true);
        drive_is_allowed(10, false);
        drive_is_allowed(15, true);
        drive_is_allowed(15, false);
        drive_is_allowed(20, true);
        drive_is_allowed(20, false);


    }

    // lets create function.
    public static void print_hello() {
        System.out.println("Hello. I am glad to see you !!!");
    }


    /** Method estimates sum of two inputs
     * @param a - number1
     * @param b - number2
     */
    public static void sum2items(double a, double b) {
        double sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is equal to " + sum);
    }


    // lets create function which check your age and says you if person is allowed to drive a car.
    public static void drive_is_allowed(int age, boolean driving_licence) {
        if ((age >= 18) && (driving_licence == true)) {
            System.out.println("You can drive");
        }
        else if ((age >= 14) && (driving_licence == true)) {
            System.out.println("You can drive under supervision");
        }
        else if ((age >= 14) && (!driving_licence)) {
            System.out.println("You forgot driving licence. You can't drive");
        }
        else {
            System.out.println("You are too young, You can't drive. Ask your parent");
        }
    }




}
