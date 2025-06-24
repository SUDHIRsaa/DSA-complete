package LoveBabbar.Stack;

public class StackusingLL {
    
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using Linked List
class Stack {
    private Node top; // Pointer to top node

    // Constructor
    Stack() {
        top = null;
    }

    // Push operation
    void push(int x) {
        Node newNode = new Node(10);  // creates node with data 10
        newNode.next = top;          // newNode.next -> null (because top is null)
        top = newNode;               // top now points to newNode
    }

    // Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // Peek operation (top element)
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
}
