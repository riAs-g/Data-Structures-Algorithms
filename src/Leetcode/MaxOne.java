package Leetcode;

import java.util.Scanner;

class MaxOne
{
    public static void main(String[] args) 
    {
        System.out.println("Enter an array to find maximum consecutive ones");
        int[] nums=new int[10];
        try (Scanner input = new Scanner(System.in)) 
        {
            for(int i=0; i<10 ;i++)
            {
                nums[i]=input.nextInt();
            }
            System.out.println(findMaxConsecutiveOnes(nums));
        }
    }   
    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int b=0,m=0,e=0;
        for (int i = 0; i < nums.length; i++) 
        {
            if(nums[i]!=1)
            {
                b=i;
            }
            if(nums[i]==1)
            {
                e=i;
                m=Math.max(m,(e-b));
            } 
        }
        return m;
    }
}