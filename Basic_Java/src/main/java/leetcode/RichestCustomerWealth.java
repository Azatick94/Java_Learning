package leetcode;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {2, 3, 4}};
        int[] account = {1, 2, 3};

        int result = Arrays.stream(account).reduce(0, Integer::sum);
        System.out.println(result);



    }
}
