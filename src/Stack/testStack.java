package Stack;

public class testStack {
    public static void main(String[] args) {
        Stack stack=new Stack();
        MinStack minStack=new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.display();
        System.out.println(minStack.getMin());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
    }
}
