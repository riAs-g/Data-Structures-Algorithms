package Leetcode;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        System.out.println(decode("3[a2[c]]"));
    }

    private static String decode(String str) {
        StringBuilder curr=new StringBuilder();
        StringBuilder num=new StringBuilder();
        Stack<String> stack=new Stack<>();
        int n;
        for (char ch: str.toCharArray()) {
            if (ch == ']') {
                while (stack.peek().toCharArray()[0] != '[') {
                    curr.insert(0, stack.pop());
                }
                stack.pop();
                while (!stack.isEmpty() && Character.isDigit(stack.peek().toCharArray()[0])) {
                    num.insert(0, stack.pop());
                }
                n= Integer.parseInt(String.valueOf(num));
                String repeatedStr = curr.toString().repeat(n);
                stack.push(repeatedStr);
                num= new StringBuilder();
                curr= new StringBuilder();
            } else {
                stack.push(String.valueOf(ch));
            }
        }
        return String.join("", stack);
    }
}
