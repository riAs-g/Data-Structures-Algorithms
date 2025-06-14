package Leetcode;

public class SearchRotated {

    public static void main(String[] args) {
        System.out.println(searchIndex(new int[] { 4, 1 }, 1));
    }

    private static int searchIndex(int[] nums, int k) {
        int l = 0, r = nums.length - 1, res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == k) {
                res = mid;
            }
            if (nums[mid] < nums[l]) {
                if (k > nums[r] || k < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (k < nums[l] || k > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return res;
    }
}
