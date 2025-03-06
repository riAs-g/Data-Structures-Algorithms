package Leetcode;

public class InsertPosition {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,3,5,6},7));
    }

    private static int search(int[] nums, int target) {
        int i=0,j=nums.length-1,mid = 0,flag=0;
        while(i<=j){
            mid=(i+j)/2;
            if(nums[mid]==target){
                flag=1;
                break;
            }
            else if(nums[mid]>target)
                j=mid-1;
            else
                i=mid+1;
        }
        if (flag==1)
            return mid;
        else
            return i;
    }
}
