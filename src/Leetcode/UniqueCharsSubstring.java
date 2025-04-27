package Leetcode;

import java.util.HashSet;

public class UniqueCharsSubstring {
    public static void main(String[] args) {
        System.out.println(longestSub(" "));
    }

    private static int longestSub(String s) {
        int i=0, j=0, longest=0;
        String str="";
        while (i< s.length() && j<= s.length()) {
            if (isUnique(s.substring(i,j))) {
                if ((j-i)>longest) {
                    str = s.substring(i, j);
                    longest = Math.max(str.length(), longest);
                }
                j++;
            } else {
                i++;
            }
        }
        return str.length();
    }

    private static boolean isUnique(String substring) {
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < substring.length(); i++) {
            set.add(substring.charAt(i));
        }
        return set.size() >= substring.length();
    }
}
