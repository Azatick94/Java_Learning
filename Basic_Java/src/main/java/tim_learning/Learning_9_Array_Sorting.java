package tim_learning;

import java.util.Arrays;

public class Learning_9_Array_Sorting {
    public static void main(String[] args) {

        // creating array of integers;
        int[] x = {1,2,3,-10, 20, 100};
        // printing out elements in list
        System.out.println("Not sorted array");
        for (int item: x) {
            System.out.println(item);
        }

        System.out.println("Sorted_lst");
        Arrays.sort(x);
        for (int item: x) {
            System.out.println(item);
        }



    }

}
