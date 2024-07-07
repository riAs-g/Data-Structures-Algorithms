package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

class TwoSum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in))
        {
            int[] n=new int[5];
            System.out.println("Enter numbers");
            for (int i = 0; i < n.length; i++) {
                n[i]=input.nextInt();
            }
            System.out.println("Enter a target");
            int y=input.nextInt();
            int[] ans=new int[2];
            ans=getIndex(n,y);
            System.out.println(Arrays.toString(ans));
        }
    }

    private static int[] getIndex(int[] nums, int target) {
        int[] i=new int[2];
        i[0]=-1;
        for (int j = 0; j < nums.length; j++) {
            for (int j2 = j+1; j2 < nums.length; j2++) {
                if (nums[j]+nums[j2]==target) {
                    i[0]=j;
                    i[1]=j2;
                    break;
                }
            }
            if (i[0] != -1) {
                break;
            }
        }
        return i;
    }
}