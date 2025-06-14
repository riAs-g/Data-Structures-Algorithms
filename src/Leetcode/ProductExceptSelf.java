package Leetcode;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(product(new int[] { 1, 2, 3, 4 })));
    }

    private static int[] product(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int[] postfix = new int[nums.length];
        postfix[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] * prefix[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i] * postfix[i + 1];
        }
        System.out.println(Arrays.toString(postfix));
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                result[i] = postfix[i + 1];
            else if (i == nums.length - 1)
                result[i] = prefix[i - 1];
            else
                result[i] = prefix[i - 1] * postfix[i + 1];
        }
        return result;
    }
}
