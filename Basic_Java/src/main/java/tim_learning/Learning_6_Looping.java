package tim_learning;

public class Learning_6_Looping {
    public static void main(String[] args) {

        // lets create array
        int[] arr = {1,5,6,3,5,6};

        System.out.println("For item: arr");
        // iteration over array for each element loop;
        for (int item: arr) {
            System.out.println("Value is equal to: " + item);
        }

        System.out.println("For loop: ");
        // iteration. for loop
        for (int i=0; i < arr.length; i++) {
            System.out.println("Value is equal to: " + arr[i]);
        }




    }
}
