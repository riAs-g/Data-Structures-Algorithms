package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SingleThreaded {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(getOrder(new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}})));
    }

    public static int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        for (int i = 0; i < n; i++) {
            tasks[i] = new int[] {tasks[i][0], tasks[i][1], i};
        }
        Arrays.sort(tasks, Comparator.comparingInt(t -> t[0]));

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) ->
                a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );

        long time=tasks[0][0];
        int i=0, idx=0;
        int[] res=new int[n];
        while (!heap.isEmpty() || i < n) {
            while (i < n && tasks[i][0] <= time) {
                heap.offer(new int[]{tasks[i][1],tasks[i][2]});
                i++;
            }
            if (heap.isEmpty()) {
                time = tasks[i][0];
            } else {
                time += heap.peek()[0];
                res[idx++] = heap.poll()[1];
            }
        }
        return res;
    }
}
