package Leetcode;

public class FirstMissingPositive {

    public static void main(String[] args) {
        System.out.println(missing(new int[] { 1, 2, 3, 10, 2147483647, 9 }));
    }

    private static int missing(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num - 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
