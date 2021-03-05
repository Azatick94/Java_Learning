package tim_learning;

import java.util.Scanner;

public class Learning_4_Scanner_If_Else {
    public static void main(String[] args) {

//        Lets create new Scanner instance;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi. Please type our name!!! ");
        String scanned_string = scan.nextLine();

//        if-else condition will be here
        if (scanned_string.equals("Azat")) {
            System.out.println("Hello boss");
        }
        else if (scanned_string.equals("Elina")) {
            System.out.println("Hello Girl");
        }
        else {
            System.out.println("I don't know you");
        }


        System.out.println("The end of the program");

    }

}
