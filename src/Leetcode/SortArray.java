package Leetcode;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 })));
    }

    private static int[] sort(int[] nums) {
        // Arrays.sort(nums);
        heapSort(nums);
        return nums;
    }

    private static void heapify(int[] arr, int n, int i) {
        int l = (i << 1) + 1;
        int r = (i << 1) + 2;
        int largestNode = i;

        if (l < n && arr[l] > arr[largestNode]) {
            largestNode = l;
        }

        if (r < n && arr[r] > arr[largestNode]) {
            largestNode = r;
        }

        if (largestNode != i) {
            int temp = arr[i];
            arr[i] = arr[largestNode];
            arr[largestNode] = temp;
            heapify(arr, n, largestNode);
        }
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
}
