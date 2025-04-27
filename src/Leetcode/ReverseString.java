package Leetcode;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("AnkitKumarRavi"));
    }

    private static char[] reverse(String str) {
        int i=0,j=str.length()-1;
        char temp;
        char[] chars=str.toCharArray();
        while (i<j) {
            temp=chars[j];
            chars[j]=chars[i];
            chars[i]=temp;
            i++;
            j--;
        }
        return chars;
    }
}
