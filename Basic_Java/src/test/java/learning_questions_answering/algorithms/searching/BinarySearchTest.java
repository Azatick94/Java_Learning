package learning_questions_answering.algorithms.searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    @DisplayName("Binary Search Test 1")
    void binarySearch1() {

        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = new BinarySearch().binarySearch(arr, 0, n - 1, x);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Binary Search Test 2")
    void binarySearch2() {

        int arr[] = {2, 3, 4, 10, 40, 100, 200, 300, 500, 1000};
        int n = arr.length;
        int x = 200;
        int result = new BinarySearch().binarySearch(arr, 0, n - 1, x);
        assertEquals(6, result);
    }

    @Test
    @DisplayName("Binary Search Test 3")
    void binarySearch3() {

        int arr[] = {2, 3, 4, 10, 40, 100, 200, 300, 500, 1000};
        int n = arr.length;
        int x = 3;
        int result = new BinarySearch().binarySearch(arr, 0, n - 1, x);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Binary Search Test 4")
    void binarySearch4() {

        int arr[] = {2, 3, 4, 10, 40, 100, 200, 300, 500, 1000};
        int n = arr.length;
        int x = -10;
        int result = new BinarySearch().binarySearch(arr, 0, n - 1, x);
        assertEquals(-1, result);
    }

    @Test
    @DisplayName("Binary Search Test 5")
    void binarySearch5() {

        int arr[] = {2, 3, 4, 10, 40, 100, 200, 300, 500, 1000};
        int n = arr.length;
        int x = 50000;
        int result = new BinarySearch().binarySearch(arr, 0, n - 1, x);
        assertEquals(-1, result);
    }

}
