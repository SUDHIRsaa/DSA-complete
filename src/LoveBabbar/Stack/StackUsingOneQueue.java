package LoveBabbar.Stack;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    Queue<Integer> q = new LinkedList<>();

    // Push operation (Costly)
    void push(int x) {
        q.add(x); // Add new element
        int size = q.size();

        // Rotate the queue to bring new element to front
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    // Pop operation (O(1))
    int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return q.remove(); // Front element is top of stack
    }

    // Peek/Top operation (O(1))
    int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek(); // Front element is top of stack
    }

    // Check if empty
    boolean isEmpty() {
        return q.isEmpty();
    }
}
