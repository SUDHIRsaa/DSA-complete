package LoveBabbar.Queue;

import java.util.Stack;



// s1-s2
// x-s1
// s2-s1

public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation (O(1))
    void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue operation (Amortized O(1), Worst O(n))
    int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return s2.pop();
    }

    // Peek front element
    int front() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return s2.peek();
    }

    // Check if empty
    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
