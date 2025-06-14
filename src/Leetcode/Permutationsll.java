package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutationsll {

    public static void main(String[] args) {
        System.out.print(permuteUnique(new int[] { 1, 1, 2 }));
    }

    private static Set<List<Integer>> res;

    public static List<List<Integer>> permuteUnique(int[] nums) {
        res = new HashSet<>();
        List<Integer> perm = new ArrayList<>();
        backtrack(nums, perm);
        return new ArrayList<>(res);
    }

    private static void backtrack(int[] nums, List<Integer> perm) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                int temp = nums[i];
                perm.add(nums[i]);
                nums[i] = Integer.MIN_VALUE;
                backtrack(nums, perm);
                nums[i] = temp;
                perm.removeLast();
            }
        }
    }
}
