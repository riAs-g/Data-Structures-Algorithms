package Leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums=new int[]{1, 2, 3, 4, 5};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        return set.size() == nums.length;
    }
}
