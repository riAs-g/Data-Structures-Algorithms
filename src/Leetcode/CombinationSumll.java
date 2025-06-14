package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSumll {

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8));
    }

    static List<List<Integer>> res = new ArrayList<>();
    static Map<Integer, Integer> count = new HashMap<>();

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> cur = new ArrayList<>();
        List<Integer> A = new ArrayList<>();

        for (int num : nums) {
            if (!count.containsKey(num)) {
                A.add(num);
            }
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        backtrack(A, target, cur, 0);
        return res;
    }

    private static void backtrack(List<Integer> nums, int target, List<Integer> cur, int i) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (target < 0 || i >= nums.size()) {
            return;
        }

        if (count.get(nums.get(i)) > 0) {
            cur.add(nums.get(i));
            count.put(nums.get(i), count.get(nums.get(i)) - 1);
            backtrack(nums, target - nums.get(i), cur, i);
            count.put(nums.get(i), count.get(nums.get(i)) + 1);
            cur.removeLast();
        }

        backtrack(nums, target, cur, i + 1);
    }
}
