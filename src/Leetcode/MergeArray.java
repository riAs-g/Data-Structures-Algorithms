package Leetcode;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        merge(new int[]{4,0,0,0,0,0},1, new int[]{1,2,3,5,6},5);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        // Merge in reverse order
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        // Fill nums1 with leftover nums2 elements
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
