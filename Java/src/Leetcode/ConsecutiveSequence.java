package Leetcode;

import java.util.HashSet;

public class ConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    public static int longestConsecutive(int[] nums) {
        int res = 0;
        HashSet<Integer> s=new HashSet<>();
        for (int num: nums) {
            s.add(num);
        }
        for (int num: nums) {
            if (!s.contains(num-1)) {
                int length = 0;
                while (s.contains(num+length)) {
                    length++;
                }
                res = Math.max(res, length);
            }
        }
        return res;
    }
}
