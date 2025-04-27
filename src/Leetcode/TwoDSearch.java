package Leetcode;

public class TwoDSearch {
    public static void main(String[] args) {
        System.out.println(binary(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},30));
    }

    private static boolean binary(int[][] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int r=0;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid][0] <= target && target <= nums[mid][nums[mid].length-1]) {
                r = mid;
                break;
            }
            else if (nums[mid][0] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        i = 0;
        j = nums[r].length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[r][mid] == target)
                return true;
            else if (nums[r][mid] < target)
                i = mid + 1;
            else
                j = mid - 1;
        }
        return false;
    }
}
