package Leetcode;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(sqrt(3));
    }

    private static int sqrt(int num) {
        int l=0,r=num,res=0;
        while (l <= r) {
            int m =l+(r-l)/2;
            if ((long) m * m < num) {
                l= m+1;
                res=m;
            } else if ((long) m * m == num) {
                return m;
            } else {
                r= m-1;
            }
        }
        return res;
    }
}
