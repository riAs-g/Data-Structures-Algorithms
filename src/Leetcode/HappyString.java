package Leetcode;

import java.util.PriorityQueue;

public class HappyString {

    public static void main(String[] args) {
        System.out.print(happy(1, 1, 7));
    }

    private static String happy(int a, int b, int c) {
        PriorityQueue<int[]> heap=new PriorityQueue<>((x, y) -> y[0] - x[0]);
        StringBuilder res=new StringBuilder("  ");
        if (a > 0) heap.offer(new int[]{a, 'a'});
        if (b > 0) heap.offer(new int[]{b, 'b'});
        if (c > 0) heap.offer(new int[]{c, 'c'});
        while (!heap.isEmpty()) {
            int[] temp= heap.poll();
            if (res.charAt(res.length()-1) == temp[1] && res.charAt(res.length()-2) == temp[1]) {
                if (heap.isEmpty()) break;
                int[] curr=heap.poll();
                if (curr[0] > 0) {
                    res.append((char) curr[1]);
                    curr[0]--;
                }
                if (curr[0] > 0) heap.offer(curr);
            } else {
                res.append((char) temp[1]);
                temp[0]--;
            }
            if (temp[0] > 0) heap.offer(temp);
        }
        return String.valueOf(res).trim();
    }
}
