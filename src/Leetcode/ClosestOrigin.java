package Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ClosestOrigin {

    public static void main(String[] args) {
        System.out.print(Arrays.deepToString(point(new int[][]{{1, 3}, {-2, 2}}, 1)));
    }

    private static int[][] point(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] point: points){
            int dist = point[0] * point[0] + point[1] * point[1];
            minHeap.offer(new int[]{dist, point[0], point[1]});
        }
        int[][] res=new int[k][2];
        for(int i=0; i<k; i++){
            int[] point=minHeap.poll();
            res[i]=new int[]{point[1], point[2]};
        }
        return res;
    }
}
