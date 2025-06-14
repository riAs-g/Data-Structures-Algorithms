package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CarPooling {

    public static void main(String[] args) {
        System.out.print(pool(new int[][] { { 2, 1, 5 }, { 3, 3, 7 } }, 5));
    }

    private static boolean pool(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int curr = 0;
        for (int[] trip : trips) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= trip[1]) {
                curr -= minHeap.poll()[1];
            }
            curr += trip[0];
            if (curr > capacity)
                return false;
            minHeap.offer(new int[] { trip[2], trip[0] });
        }
        return true;
    }
}
