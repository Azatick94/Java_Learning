package tim_learning;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Learning_7_Sets_Lists {
    public static void main(String[] args) {

        // Sets
        Set<Integer> set_a = new HashSet<Integer>();
        set_a.add(1);
        set_a.add(5);
        set_a.add(10);
        set_a.add(10);

        System.out.println("Set is equal to: " + set_a);

        // Just Simple Arrays
        ArrayList<Integer> array_a = new ArrayList<Integer>();
        array_a.add(1);
        System.out.println("ArrayList: ");
        System.out.println(array_a);
        System.out.println("Array_Size is: " + array_a.size());


    }

}
