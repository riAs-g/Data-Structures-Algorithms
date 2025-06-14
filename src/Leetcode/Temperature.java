package Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Temperature {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTemp(new int[] { 55, 38, 53, 81, 61, 93, 97, 32, 43, 78 })));
    }

    private static int[] getTemp(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            while (!stack.isEmpty() && temperatures[currDay] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                ans[prevDay] = currDay - prevDay;
            }
            stack.add(currDay);
        }
        return ans;
    }
}
