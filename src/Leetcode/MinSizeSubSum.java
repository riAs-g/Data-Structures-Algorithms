package Leetcode;

public class MinSizeSubSum {

    public static void main(String[] args) {
        System.out.println(subSum(new int[] { 1, 1, 1, 1, 1, 1 }, 4));
    }

    private static int subSum(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, res = Integer.MAX_VALUE;
        while (j < nums.length && i <= j) {
            sum += nums[j];
            while (sum >= k) {
                res = Math.min(j - i + 1, res);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
