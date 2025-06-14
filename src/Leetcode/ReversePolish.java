package Leetcode;

import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        System.out.println(
                calculate(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
    }

    private static int calculate(String[] exp) {
        Stack<Integer> s = new Stack<>();
        int res, p1;
        for (String str : exp) {
            switch (str) {
                case "/" -> {
                    p1 = s.pop();
                    res = s.pop() / p1;
                    s.push(res);
                }
                case "-" -> {
                    p1 = s.pop();
                    res = s.pop() - p1;
                    s.push(res);
                }
                case "*" -> {
                    p1 = s.pop();
                    res = s.pop() * p1;
                    s.push(res);
                }
                case "+" -> {
                    p1 = s.pop();
                    res = s.pop() + p1;
                    s.push(res);
                }
                default -> s.push(Integer.valueOf(str));
            }
        }
        return s.pop();
    }
}
