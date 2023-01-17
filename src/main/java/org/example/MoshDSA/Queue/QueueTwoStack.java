package org.example.MoshDSA.Queue;

import java.util.Stack;

public class QueueTwoStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enque(int item){
        stack1.push(item);
    }
    public int deque(){
        if (isEmpty())
            throw new IllegalStateException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
