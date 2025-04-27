package Leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class WindowMaximum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(windowMax(new int[]{5,3,1,2,0,5}, 3)));
    }

    private static int[] windowMax(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int j = 0;
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty() && q.peekFirst() < i - k + 1)
                q.pollFirst();
            while (!q.isEmpty() && nums[i] > nums[q.peekLast()])
                q.pollLast();
            q.offer(i);
            if (i >= k - 1)
                ans[j++] = nums[q.peekFirst()];
        }
        return ans;
    }
}
