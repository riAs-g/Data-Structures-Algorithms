package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(collision(new int[]{10, 5, -2})));
    }

    private static int[] collision(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        for (int num: nums) {
            while (!stack.isEmpty() && num < 0 && stack.peek() > 0) {
                int diff=num+stack.peek();
                if (diff < 0) {
                    stack.pop();
                } else if (diff == 0) {
                    stack.pop();
                    num=0;
                } else {
                    num=0;
                }
            }
            if (num!=0) {
                stack.push(num);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
