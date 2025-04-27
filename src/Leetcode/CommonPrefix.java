package Leetcode;

public class CommonPrefix {

    public static void main(String[] args) {
        System.out.println(prefix(new String[]{"cir","cab","car"}));
    }

    private static String prefix(String[] strs) {
        String pre =strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (!(strs[i].startsWith(pre))) {
                pre=pre.substring(0,pre.length()-1);
                i=0;
            }
        }
        return pre;
    }
}
