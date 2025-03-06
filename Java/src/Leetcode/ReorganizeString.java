package Leetcode;

import java.util.PriorityQueue;

public class ReorganizeString {

    public static void main(String[] args) {
        System.out.print(reorganize("aab"));
    }

    private static String reorganize(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                heap.offer(new int[]{freq[i], i});
            }
        }
        int[] prev=null;
        StringBuilder res=new StringBuilder();
        while (!heap.isEmpty() || prev != null) {
            if (prev != null && heap.isEmpty()) {
                return "";
            }

            int[] temp=heap.poll();
            res.append((char) (temp[1] + 'a'));
            temp[0]--;
            if (prev !=  null) {
                heap.offer(prev);
                prev=null;
            }
            if (temp[0] > 0) {
                prev=temp;
            }
        }
        return String.valueOf(res);
    }
}
