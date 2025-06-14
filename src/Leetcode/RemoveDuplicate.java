package Leetcode;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        System.out.println(remove(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }

    private static int remove(int[] nums) {
        int res = 0, i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                res++;
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return res + 1;
    }
}
