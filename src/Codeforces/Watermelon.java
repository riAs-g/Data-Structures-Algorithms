package Codeforces;

import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        boolean ans = even(scanner.nextInt());
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
        scanner.close();
    }

    private static boolean even(int i) {
        if (i > 2)
            return i % 2 == 0;
        else
            return false;
    }
}
