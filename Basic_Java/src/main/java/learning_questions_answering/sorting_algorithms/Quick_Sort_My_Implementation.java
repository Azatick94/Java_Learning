package learning_questions_answering.sorting_algorithms;

import java.util.Arrays;

public class Quick_Sort_My_Implementation {

    public static void main(String[] args) {

        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
        System.out.println("Initial state:");
        System.out.println(Arrays.toString(x));

        quickSort(x, 0, x.length-1);
        System.out.println("After state:");
        System.out.println(Arrays.toString(x));


    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        int leftInit = left;
        int rightInit = right;

        int pivotIndex = (left+right)/2;
        int pivotValue = array[pivotIndex];

        if (left>=right) {
            return; // exiting
        }

        // sorting values withing array
        while (left<right) {
            while (array[left]<pivotValue)
                left++;
            while (array[right]>pivotValue)
                right--;

            // swap places
            if (left<=right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(array, leftInit, pivotIndex);
        quickSort(array, pivotIndex+1, rightInit);
    }


}
