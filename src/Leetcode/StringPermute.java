package Leetcode;

import java.util.HashMap;

public class StringPermute {
    public static void main(String[] args) {
        System.out.println(checkInclusion("akn", "ankit"));
    }

    private static boolean checkInclusion(String s1, String s2) {
        int i=0, j=s1.length()-i;
        HashMap<Character,Integer> map=new HashMap<>();
        for (int k = 0; k < s1.length(); k++) {
            map.put(s1.charAt(k), map.getOrDefault(s1.charAt(k),0)+1);
        }
        while (j<=s2.length()) {
            if (map.equals(getMap(s2.substring(i,j)))) {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }

    private static HashMap<Character,Integer> getMap(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int k = 0; k < str.length(); k++) {
            map.put(str.charAt(k), map.getOrDefault(str.charAt(k),0)+1);
        }
        return map;
    }
}
