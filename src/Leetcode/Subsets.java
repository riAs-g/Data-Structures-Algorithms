package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,2}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> map=new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, subset, map);
        return new ArrayList<>(map);
    }

    private static void dfs(int[] nums, int i, List<Integer> subset, HashSet<List<Integer>> map) {
        if (i >= nums.length) {
            map.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums, i + 1, subset, map);
        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, subset, map);
    }
}
