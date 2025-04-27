package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueues {

    private final Queue<Integer> q;

    public StackQueues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        for (int i = q.size() - 1; i > 0; i--) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
