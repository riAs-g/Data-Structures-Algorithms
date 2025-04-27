package Leetcode;

public class SearchRotatedll {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,0,1,1,1}, 0));
    }

    private static boolean search(int[] nums, int k) {
        int l=0, r= nums.length-1;
        boolean res=false;
        while (l <= r) {
            int mid=(l+r)/2;
            if (nums[mid] == k) {
                res=true;
                break;
            }
            if (nums[mid] < nums[l]) {
                if (k > nums[r] || k < nums[mid]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else if (nums[mid] > nums[l]){
                if (k < nums[l] || k > nums[mid]) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            } else {
                l++;
            }
        }
        return res;
    }
}
