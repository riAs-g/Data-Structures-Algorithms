package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class KClosest {

    public static void main(String[] args) {
        System.out.println(closest(new int[] { 1, 1, 2, 3, 4, 5 }, 4, 6));
    }

    private static List<Integer> closest(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int l = 0, r = arr.length - k;
        while (l < r) {
            int m = (l + r) / 2;
            if (x - arr[m] > arr[m + k] - x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        for (int i = l; i < l + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}
