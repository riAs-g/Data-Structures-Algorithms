package Leetcode;

import java.util.*;

class Even {
    public static void main(String[] args) {
        System.out.println("Enter three numbers to check if evenly spaced");
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println(evenlySpaced(a, b, c));
        }
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) {
                return b - c == a - b;
            }
            if (c > b) {
                return c - b == a - c;
            }
        }
        if (b > a && b > c) {
            if (a > c) {
                return b - a == a - c;
            }
            if (c > a) {
                return c - a == b - c;
            }
        }
        if (c > a && c > b) {
            if (b > a) {
                return b - a == c - b;
            }
            if (a > b) {
                return c - a == a - b;
            }
        }
        return false;
    }
}