package problems;
/**
 * https://leetcode.com/problems/implement-queue-using-stacks
 * 
 * Stack1 is used as queue and Stack2 will be used to maintain the FIFO order while pushing
 * - Adds new element to stack1 if empty
 * - Otherwise, moves all the elements to stack2. Adds the new element to stack1 and moves elements from stack2 back to stack1
 * Pop and peek check top of stack1 as it represents the front of queue
 * 
 * Time:  O(n) - push, O(1) - pop, peek and empty
 * Space: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingStacks {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new ArrayDeque<>();
        stack2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
        return stack1.pop();
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
