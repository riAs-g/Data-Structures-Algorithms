package Leetcode;

public class CommonSubsequence {

    public static void main(String[] args) {
        System.out.println(subSequence("ankit","ravi", 5, 4));
    }

    //DP Memoization
    private static int subSequence(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        if (s1.charAt(m-1)==s2.charAt(n-1)) {
            return 1+subSequence(s1,s2,m-1,n-1);
        } else {
            return Math.max(subSequence(s1,s2,m-1,n),subSequence(s1,s2,m,n-1));
        }
    }
}
