package Leetcode;

public class RotatedSorted {

    public static void main(String[] args) {
        System.out.println(findMin(new int[] { 0, 1, 2, 3 }));
    }

    private static int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, mid = 0;
        if (nums[l] < nums[r])
            return nums[l];
        while (l < r) {
            mid = (l + r) / 2;
            if (nums[mid] > nums[r] && nums[mid] > nums[l]) {
                l = mid;
            } else if (nums[mid] < nums[r] && nums[mid] < nums[l]) {
                r = mid;
            } else {
                r--;
                l++;
            }
        }
        return nums[l];
    }
}
