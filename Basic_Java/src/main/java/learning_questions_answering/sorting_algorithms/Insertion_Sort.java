package learning_questions_answering.sorting_algorithms;

public class Insertion_Sort {

    public static void main(String[] args) {

        int[] lst = new int[]{5, 2, 12, 12, 1};
        int[] result = sort(lst);
        for (int item : result) {
            System.out.println(item);
        }


    }

    public static int[] sort(int[] array) {
        int size = array.length;

        if (size <= 1) return array;

        for (int i = 1; i < size; i++) {

            int j = i;
            while (j > 0) {
                int prev = array[j - 1];
                int currentVal = array[j];

                if (currentVal < prev) {
                    int prevTemp = prev;
                    array[j - 1] = currentVal;
                    array[j] = prevTemp;
                } else {
                    break;
                }
                j--;
            }
        }
        return array;
    }


}
