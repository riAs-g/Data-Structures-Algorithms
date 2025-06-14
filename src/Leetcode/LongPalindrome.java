package Leetcode;

import java.util.Scanner;

public class LongPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        try (Scanner input = new Scanner(System.in)) {
            String str = input.nextLine();
            System.out.println(longestPalindrome(str));
        }
    }

    public static String longestPalindrome(String str) {
        String pal = "";
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length(); j > i; j--) {
                String s1 = str.substring(i, j);
                if (Palindrome(s1)) {
                    if (s1.length() > len) {
                        pal = s1;
                        len = pal.length();
                        break;
                    }
                }
            }
        }
        return pal;
    }

    public static boolean Palindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.contentEquals(rev);
    }
}