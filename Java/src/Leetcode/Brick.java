package Leetcode;

import java.util.Scanner;

class Brick
{
    public static void main(String[] args) 
    {
        System.out.println("Enter small bricks, large bricks, Goal");
        try (Scanner input = new Scanner(System.in)) 
        {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            System.out.println(makeBricks(a,b,c));
        }
    }
    public static boolean makeBricks(int small, int big, int goal) 
    {
        for(int i=1; i<=big ;i++)
        {
            for(int j=1; j<=small ;j++) {
                if (i * 5 == goal) {
                    return true;
                }
                if (j == goal)
                {return true;}
                if((i*5)+j==goal)
                {return true;}
            }
        }
        return false;
    }
}