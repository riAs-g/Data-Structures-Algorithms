package Leetcode;

import java.util.Arrays;

public class ConcatArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concat(new int[]{1,2,3,4,5})));
    }

    private static int[] concat(int[] nums) {
        int n= nums.length;
        int[] ans=new int[n+n];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
