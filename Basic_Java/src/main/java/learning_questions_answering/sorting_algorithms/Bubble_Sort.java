package learning_questions_answering.sorting_algorithms;

public class Bubble_Sort {

    public static void main(String[] args) {

        int[] sampleArray = new int[]{2, 3, 4, 1};
        int[] sortedArray = sort(sampleArray);

        for (int item : sortedArray) {
            System.out.println(item);
        }

    }

    /**
     * Bubble sort is a simple sorting algorithm that compares adjacent elements of an array and swaps
     * them if the element on the right is smaller than the one on the left.
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        int len = arr.length;

        for (int i=0; i<len-1; i++) {
            for (int k=0; k<len-i-1; k++) {
                if (arr[k]>arr[k+1]) {
                    int swap = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = swap;
                }
            }
        }

        return arr;
    }


}
