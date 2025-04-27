package Heap;

import java.util.PriorityQueue;

public class KthLargestStream {

    PriorityQueue<Integer> minHeap;
    int K;
    public KthLargestStream(int k, int[] nums) {
        this.K=k;
        this.minHeap =new PriorityQueue<>();
        for (int num: nums) {
            minHeap.offer(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > K) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
