package Leetcode;

import java.util.*;

class Power
{
    public static void main(String[] args) 
    {
        try (Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter a number");
            double x=input.nextFloat();
            System.out.println("Enter a power");
            int y=input.nextInt();
            double ans=getPower(x, y);
            {System.out.println(ans);}
        }
    }

    private static double getPower(double x, int n) 
    {
        return helper(x, (long) n);
    }

    private static double helper(double num, Long pow)
    {
        if (num < -10000 || num > 10000)
        {
            return 0;
        }
        if (pow==0) 
        {
            return 1;
        }
        if (pow<0)
        {
            pow=pow*-1;
            num=1/num;
        }
            if(pow%2==0){
                return helper(num*num,pow/2);
            }
            else return num*helper(num,pow-1);
    }
}