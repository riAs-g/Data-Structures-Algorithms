package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k] + nums[i];
                if (sum == 0) {
                    list.add(new ArrayList<>());
                    list.getLast().add(nums[i]);
                    list.getLast().add(nums[j]);
                    list.getLast().add(nums[k]);
                    break;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return list;
    }
}
