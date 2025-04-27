package Leetcode;

import java.util.Arrays;

public class RescueBoats {

    public static void main(String[] args) {
        System.out.println(rescue(new int[]{3,1,2,2}, 3));
    }

    private static int rescue(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0, i=0, j= nums.length-1;
        while (i <= j) {
            if (i==j) {
                res++;
                break;
            }
            if (nums[i] + nums[j] <= k) {
                res+=1;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) {
                res+=1;
                j--;
            }
        }
        return res;
    }
}
