package GFG;

import java.util.Stack;

public class ArrayArea {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        System.out.println(greatestAreas(arr));
    }

    private static int greatestAreas(int[][] arr) {
        int area = 0;
        area = Math.max(area, greatestArea(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] += arr[i - 1][j];
                } else {
                    break;
                }
            }
            area = Math.max(area, greatestArea(arr[i]));
        }
        return area;
    }

    public static int greatestArea(int[] arr) {
        int area = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int tp = s.pop();
                int curr = arr[tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                area = Math.max(curr, area);
            }
            s.push(i);
        }
        while (!s.isEmpty()) {
            int tp = s.pop();
            int curr = arr[tp] * (s.isEmpty() ? arr.length : (arr.length - s.peek() - 1));
            area = Math.max(curr, area);
        }
        return area;
    }
}