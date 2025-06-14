package Heap;

import java.util.PriorityQueue;

public class StoneWeight {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] { 2, 7, 3 }));
    }

    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int num : stones) {
            maxHeap.add(-num);
        }
        int h1, h2;
        while (maxHeap.size() > 1) {
            h1 = maxHeap.poll();
            h2 = maxHeap.poll();
            if (h2 - h1 > 0) {
                maxHeap.add(-(h2 - h1));
            }
        }
        return !maxHeap.isEmpty() ? -maxHeap.poll() : 0;
    }
}
