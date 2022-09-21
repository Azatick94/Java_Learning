package learning_questions_answering.sorting_algorithms.merger_sort;

public class Solution {
    public static void main(String[] args) {
        // here some example
        int[] arr = {3, 2, 1, 4};
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);

        System.out.println("Result");
        for (int item : temp) {
            System.out.println(item);
        }

    }

    public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {

        if (leftStart >= rightEnd) {
            return;
        }

        int middle = (rightEnd + leftStart) / 2;

        // sort left half
        mergeSort(arr, temp, leftStart, middle);
        // sort right half
        mergeSort(arr, temp, middle + 1, rightEnd);

        // merge halves
        mergeHalves(arr, temp, leftStart, rightEnd);

    }

    private static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        // arr [2,3,4, 1,5,6]
        // temp [1,, ,,,]

        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }

        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }

}
