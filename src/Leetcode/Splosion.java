package Leetcode;

import java.util.Scanner;

class Splosion
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a word for Splosion!");
        try (Scanner input = new Scanner(System.in)) 
        {
            String str=input.nextLine();
            System.out.println(stringSplosion(str));
        }
    }
    public static String stringSplosion(String str) 
    {
        StringBuilder spl= new StringBuilder();
        int b=0;
        for(int i=1; i<=str.length(); i++)
        {
            spl.append(str, b, i);
        }
        return spl.toString();
    }
}