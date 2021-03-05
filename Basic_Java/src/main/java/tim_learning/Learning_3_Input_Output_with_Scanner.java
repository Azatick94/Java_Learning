package tim_learning;

import java.util.Scanner;

public class Learning_3_Input_Output_with_Scanner {
    public static void main(String[] args) {

        // creating new Scanner instance
        Scanner sc = new Scanner(System.in);
        System.out.println("Write our name: ");
        String scanned = sc.nextLine();
        System.out.println("Hello " + scanned);


    }
}
