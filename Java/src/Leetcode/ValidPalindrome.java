package Leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ankit 0I0 tikna"));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int i=0, j=str.length()-1;
        while (i<=j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
