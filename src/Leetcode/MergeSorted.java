package Leetcode;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1,2,3,7},4,new int[]{2,5,6},3)));
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        int p=0,k=0,l=0;
        while (p< m && l< n) {
            int i1= nums1[p];
            int i2= nums2[l];
            if (i1 < i2) {
                res[k]=i1;
                k++;
                p++;
            } else if (i2 < i1) {
                res[k]=i2;
                k++;
                l++;
            }else {
                res[k]=i1;
                p++;
                k++;
            }
        }
        if (l< n) {
            while (l< n) {
                res[k] = nums2[l];
                l++;
                k++;
            }
        }
        if (p< m) {
            while (p< m) {
                res[k] = nums1[p];
                p++;
                k++;
            }
        }
        return res;
    }
}
