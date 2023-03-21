package learning_questions_answering.algorithms.searching;

class BinarySearch {

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    int binarySearch(int arr[], int l, int r, int elem) {

        // [2, 3, 4, 10, 40]; 10
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == elem) {
                return mid;
            }

            if (arr[mid] < elem) {
                // move l -> , right stays
                l = mid + 1;
                return binarySearch(arr, l, r, elem);
            }

            if (arr[mid] > elem) {
                // move r <-, left stays
                r = mid - 1;
                return binarySearch(arr, l, r, elem);
            }
        }

        return -1;
    }


}
