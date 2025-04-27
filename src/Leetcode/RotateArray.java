package Leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    //Can also use revering the array method
    private static void rotate(int[] nums, int k) {
        if (k== nums.length) return;
        int l= nums.length;
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[(i+k)%l]=nums[i];
        }
        System.arraycopy(res, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(res));
    }
}
