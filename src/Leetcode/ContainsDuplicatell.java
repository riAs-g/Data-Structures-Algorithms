package Leetcode;

import java.util.HashSet;

public class ContainsDuplicatell {

    public static void main(String[] args) {
        System.out.println(check(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
    }

    private static boolean check(int[] nums, int k) {
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            if (j - i > k) {
                set.remove(nums[i]);
                i++;
            }
            if (set.contains(nums[j])) {
                return true;
            }
            set.add(nums[j]);
        }
        return false;
    }
}
