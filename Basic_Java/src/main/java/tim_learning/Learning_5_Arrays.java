package tim_learning;

public class Learning_5_Arrays {
    public static void main(String[] args) {

//  To create Array list we need use square brackers. For example:
        String[] arr1 = new String[5]; // String[N] - where N - number of elements in Array;
        arr1[0] = "My ";
        arr1[1] = "Name ";
        arr1[2] = "Is ";
        arr1[3] = "Azat ";
        arr1[4] = "!!!";
        System.out.println(arr1[0]+arr1[1]+arr1[2]+arr1[3]+arr1[4]);


//        another way of creating Arrays;
        String[] arr2 = {"My ", "Name ", "Is ", "Azat ", "!!!"};  // so we just create list of elements in curly brackets.
        System.out.println(arr2[0]+arr2[1]+arr2[2]+arr2[3]+arr2[4]);



    }
}
