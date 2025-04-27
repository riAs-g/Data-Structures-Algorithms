package Leetcode;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 1, 2, 2, 3, 4, 5, 7}, 7)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i=0, j=numbers.length-1, sum=numbers[i]+numbers[j];
        while (i <= j) {
            if (sum == target)
                return new int[]{i, j};
            else if (sum > target) {
                j--;
            } else {
                i++;
            }
            sum=numbers[i]+numbers[j];
        }
        return null;
    }
}
