package Leetcode;

public class RangeSum2D {

    public static void main(String[] args) {
        NumMatrix(new int[][]{{3,0,1,4,2},{5, 6, 3, 2, 1},{1, 2, 0, 1, 5},{4, 1, 0, 1, 7},{1, 0, 3, 0, 5}});
        System.out.println(sumRegion(2, 1, 4, 3));
    }

    private static int[][] sumMat;

    public static void NumMatrix(int[][] matrix) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        sumMat = new int[ROWS + 1][COLS + 1];
        for (int r = 0; r < ROWS; r++) {
            int prefix = 0;
            for (int c = 0; c < COLS; c++) {
                prefix += matrix[r][c];
                int above = sumMat[r][c + 1];
                sumMat[r + 1][c + 1] = prefix + above;
            }
        }
    }

    public static int sumRegion(int row1, int col1, int row2, int col2) {
        row1++; col1++; row2++; col2++;
        int bottomRight = sumMat[row2][col2];
        int above = sumMat[row1 - 1][col2];
        int left = sumMat[row2][col1 - 1];
        int topLeft = sumMat[row1 - 1][col1 - 1];
        return bottomRight - above - left + topLeft;
    }
}
