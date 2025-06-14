package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

class Parity {
    public static void main(String[] args) {
        System.out.println("Enter an array to sort by parity");
        int[] nums = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                nums[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(sortArrayByParity(nums)));
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] % 2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
        return nums;
    }
}