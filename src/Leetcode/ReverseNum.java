package Leetcode;

import java.util.Scanner;

class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter a number for reversal");
        try (Scanner input = new Scanner(System.in)) {
            long str = input.nextLong();
            System.out.println(reverse(str));
        }
    }

    private static int reverse(long str) {
        long num = 0;
        if (str > 0) {
            while (str > 0) {
                long rev = str % 10;
                num = num * 10 + rev;
                str = str / 10;
            }
        }
        if (str < 0) {
            while (str < 0) {
                long rev = str % 10;
                num = num * 10 + rev;
                str = str / 10;
            }
        }
        if (num > Math.pow(-2, 31) && num < (Math.pow(2, 31) - 1)) {
            return (int) num;
        } else {
            return 0;
        }
    }
}