package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static void main(String[] args) {
        System.out.print(combine(4, 2));
    }

    private static List<List<Integer>> res;

    public static List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        backtrack(1, new ArrayList<>(), n, k);
        return res;
    }

    private static void backtrack(int start, ArrayList<Integer> comb, int n, int k) {
        if (comb.size() == k) {
            res.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            backtrack(i+1, comb, n, k);
            comb.removeLast();
        }
    }
}
