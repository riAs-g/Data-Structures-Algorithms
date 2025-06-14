package Leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskShceduler {

    public static void main(String[] args) {
        System.out.print(schedule(new char[] { 'A', 'C', 'A', 'B', 'D', 'B' }, 1));
    }

    private static int schedule(char[] chars, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> queue = new LinkedList<>();
        int time = 0;
        int[] count = new int[26];
        for (char ch : chars) {
            count[ch - 'A']++;
        }
        for (int cnt : count) {
            if (cnt > 0) {
                heap.add(cnt);
            }
        }
        while (!heap.isEmpty() || !queue.isEmpty()) {
            time++;
            if (heap.isEmpty()) {
                time = queue.peek()[1];
            } else {
                int cnt = heap.poll() - 1;
                if (cnt > 0) {
                    queue.add(new int[] { cnt, time + k });
                }
            }
            if (!queue.isEmpty() && queue.peek()[1] == time) {
                heap.add(queue.poll()[0]);
            }
        }
        return time;
    }
}
