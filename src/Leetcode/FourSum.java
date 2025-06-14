package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class FourSum {

    public static void main(String[] args) {
        System.out.println(fourSum(new int[] { 0, 0, 0, 0 }, 0));
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        int j, k;
        for (int l = 0; l < nums.length - 3; l++) {
            for (int i = l + 1; i < nums.length - 2; i++) {
                j = i + 1;
                k = nums.length - 1;
                while (j < k) {
                    if ((long) nums[l] + (long) nums[i] + (long) nums[j] + (long) nums[k] == (long) target)
                        res.add(Arrays.asList(nums[l], nums[i], nums[j], nums[k]));
                    if ((long) (nums[l] + nums[i] + nums[j] + nums[k]) < (long) target)
                        j++;
                    else
                        k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
