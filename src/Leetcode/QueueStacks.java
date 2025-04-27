package Leetcode;

import java.util.Stack;

public class QueueStacks {

    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public QueueStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int res = stack1.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public int peek() {
        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }
        int res = stack1.peek();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return res;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
