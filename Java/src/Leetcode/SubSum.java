package Leetcode;

import java.util.HashMap;

public class SubSum {

    public static void main(String[] args) {
        System.out.println(subSum(new int[]{1,1,1,1,2,2,3}, 2));
    }

    private static int subSum(int[] nums, int k) {
        int res=0,cursum=0,diff;
        HashMap<Integer,Integer> prefix=new HashMap<>();
        prefix.put(0,1);
        for (int num:nums) {
            cursum+=num;
            diff=cursum-k;
            res+=prefix.getOrDefault(diff,0);
            prefix.put(cursum,prefix.getOrDefault(cursum,0)+1);
        }
        System.out.println(prefix);
        return res;
    }
}
