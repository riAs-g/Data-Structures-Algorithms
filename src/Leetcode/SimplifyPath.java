package Leetcode;

import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplify("/../"));
    }

    private static String simplify(String str) {
        Stack<String> stack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for (char ch : (str + "/").toCharArray()) {
            if (ch == '/') {
                if (String.valueOf(curr).equals("..")) {
                    if (!stack.isEmpty())
                        stack.pop();
                } else if (!String.valueOf(curr).isEmpty() && !String.valueOf(curr).equals(".")) {
                    stack.push(String.valueOf(curr));
                }
                curr.setLength(0);
            } else {
                curr.append(ch);
            }
        }
        return "/" + String.join("/", stack);
    }
}
