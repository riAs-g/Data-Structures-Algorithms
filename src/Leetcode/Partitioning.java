package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Partitioning {

    public static void main(String[] args) {
        System.out.print(partition("aab"));
    }

    private static final List<List<String>> res = new ArrayList<>();
    private static final List<String> part = new ArrayList<>();

    private static List<List<String>> partition(String s) {
        dfs(s, 0);
        return res;
    }

    private static void dfs(String s, int i) {
        if (i >= s.length()) {
            res.add(new ArrayList<>(part));
            return;
        }
        for (int j = i; j < s.length(); j++) {
            if (palindrome(s, i, j)) {
                part.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                part.removeLast();
            }
        }
    }

    private static boolean palindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
