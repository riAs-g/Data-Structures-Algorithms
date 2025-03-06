package Leetcode;

public class Permutations {
    public static void main(String[] args) {
        permute("ABCD",0,4);
    }

    private static void permute(String str, int start, int end) {
        if (start == end-1)
            System.out.println(str);
        else {
            for (int i=start; i <  end; i++) {
                str=swap(str,start,i);
                permute(str,start+1,end);
                str=swap(str,start,i);
            }
        }
    }

    private static String swap(String str, int start, int end) {
        char[] b=str.toCharArray();
        char ch;
        ch=b[start];
        b[start]=b[end];
        b[end]=ch;
        return String.valueOf(b);
    }
}
