package Leetcode;

public class AlterStrings {

    public static void main(String[] args) {
        System.out.println(merge("abcg","def"));
    }

    private static String merge(String s1, String s2) {
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while (i<s1.length() && j<s2.length()) {
            str.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }
        if (i<s1.length())
            str.append(s1.substring(i));
        if (j<s2.length())
            str.append(s2.substring(j));
        return String.valueOf(str);
    }
}
