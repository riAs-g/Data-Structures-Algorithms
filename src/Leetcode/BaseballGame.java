package Leetcode;

import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args) {
        System.out.println(game(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
    }

    private static int game(String[] strs) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0, i, j;
        for (String str : strs) {
            switch (str) {
                case ("+"): {
                    j = stack.pop();
                    i = stack.peek();
                    stack.push(j);
                    stack.push(j + i);
                    sum += stack.peek();
                    break;
                }
                case ("D"): {
                    stack.push(2 * stack.peek());
                    sum += stack.peek();
                    break;
                }
                case ("C"): {
                    sum -= stack.pop();
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(str));
                    sum += stack.peek();
                    break;
                }
            }
        }
        return sum;
    }
}
