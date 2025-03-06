package Codeforces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        boolean ans = even(scanner.nextInt());
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean even(int i) {
        return i % 2 == 0;
    }
}
