package Leetcode;

import java.util.Scanner;

class WaterContainer {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter size of the array");
            int n = input.nextInt();
            System.out.println("Enter an array to find most water contained");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = input.nextInt();
            }
            System.out.println(maxArea(nums));
        }

    }

    public static int maxArea(int[] height) {
        if (height.length == 1) {
            return 0;
        }
        int maxarea = Integer.MIN_VALUE, i = 0, j = height.length - 1, l = j;
        while (i < j) {
            int min = Math.min(height[i], height[j]);
            int area = min * l;
            maxarea = Math.max(maxarea, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            l--;
        }
        return maxarea;
    }
}