package GFG;
import java.util.Scanner;

public class Patterns 
{
    public static void main(String[] args) 
    {
        int n;
        System.out.println("Enter a Number");
        try (Scanner input = new Scanner(System.in)) 
        {
            n=input.nextInt();
        }
        pattern(n);
    }
    public static void pattern(int n)
    {
        int k=1;
        for (int i = 0; i < n; i++) 
        {
            int l=k;
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(l);
                if(l==0)
                {l=1;}
                else
                {l=0;}
            }
            System.out.println();
            if(k==0)
            {k=1;}
            else
            {k=0;}
        }
    }
}