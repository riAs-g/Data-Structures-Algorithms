package Striver;

import java.util.Arrays;
import java.util.Scanner;

public class RecRevArray {
    public static void main(String[] args) {
        System.out.println("Enter an array to reverse");
        int[] num = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                num[i] = input.nextInt();
            }
            int start = 0, end = num.length - 1;
            System.out.println(Arrays.toString(rev(num, start, end)));
        }
    }

    private static int[] rev(int[] nums, int start, int end) {
        if (start >= end)
            return nums;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        return rev(nums, start + 1, end - 1);
    }
}