package Stack;

public class MinStack {

    Stack stack;
    Stack minstack;

    public MinStack() {
        Stack stack=new Stack();
        Stack minstack=new Stack();
    }

    public void push(int val) {
        stack.push(val);
        if (minstack.isEmpty())
            minstack.push(val);
        else minstack.push(Math.min(minstack.top(), val));
    }

    public int pop() {
        minstack.pop();
        return stack.pop();
    }

    public int top() {
        return stack.top();
    }

    public int getMin(){
        return minstack.top();
    }
}
