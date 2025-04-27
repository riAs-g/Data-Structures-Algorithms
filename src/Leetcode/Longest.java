package Leetcode;

import java.util.Scanner;

class Longest
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a String to find longest word");
        try (Scanner input = new Scanner(System.in)) 
        {
            String str=input.nextLine();
            System.out.println(longest(str));
        }
    }

    public static String longest(String str) 
    {
        str=str+" ";
        int n=Integer.MIN_VALUE;
        int b=0, e=0;
        String maxS="";
        for(int i=b; i<str.length(); i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {
                while(e<=i)
                {
                    e++;
                }
            }
            if(!Character.isLetter(str.charAt(i)))
            {
                String s=str.substring(b, e);
                if(s.length()>n)
                {
                    maxS=str.substring(b,e);
                }
                b=i+1;
                e=i+1;
                n=maxS.length();
            }
        }
        return maxS;
    }
}