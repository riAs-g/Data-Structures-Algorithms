package Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty())
            minstack.push(val);
        else minstack.push(Math.min(minstack.peek(), val));
    }

    public int pop() {
        minstack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin(){
        return minstack.peek();
    }

    public void display(){
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
