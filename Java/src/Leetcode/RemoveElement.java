package Leetcode;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }

    private static int removeElement(int[] ints, int target) {
        int i=0,j= ints.length-1,temp,count=0;
        while (i<=j){
            if (ints[i]==target) {
                count++;
                temp=ints[j];
                ints[j]=0;
                ints[i]=temp;
                j--;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(ints));
        return count;
    }
}
