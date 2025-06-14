package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class WordSearch {
    public static void main(String[] args) {
        System.out.print(search(new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } },
                "ABCB"));
    }

    private static boolean search(char[][] board, String word) {
        int cols = board[0].length;
        int rows = board.length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final Set<int[]> path = new HashSet<>();

    private static boolean dfs(char[][] board, String word, int r, int c, int i) {
        if (i == word.length()) {
            return true;
        }
        if (r >= board.length || r < 0 ||
                c >= board[0].length || c < 0 ||
                board[r][c] != word.charAt(i) ||
                path.contains(new int[] { r, c })) {
            return false;
        }
        path.add(new int[] { r, c });
        boolean res = dfs(board, word, r + 1, c, i + 1) ||
                dfs(board, word, r, c + 1, i + 1) ||
                dfs(board, word, r, c - 1, i + 1) ||
                dfs(board, word, r - 1, c, i + 1);
        path.remove(new int[] { r, c });

        return res;
    }
}
