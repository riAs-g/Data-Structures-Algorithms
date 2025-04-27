package Leetcode;

import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
        System.out.print(largest(new int[]{3,2,3,1,2,4,5,5,6}, 5));
    }

    private static int largest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int num: nums) {
            heap.add(num);
            if (heap.size() > k)
                heap.poll();
        }
        if (!heap.isEmpty())
            return heap.peek();
        else
            return 0;
    }
}
