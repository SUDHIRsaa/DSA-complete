package LoveBabbar.Queue;

public class QueueusingLL {
    
}
// Node class for Linked List (already defined above)
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
// Queue class using Linked List
class Queue {
    private Node front, rear; // Pointers to front and rear

    // Constructor
    Queue() {
        front =null;
         rear = null;
    }

    // Enqueue operation
    void enqueue(int x) {
        Node newNode = new Node(x);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;        // link current rear to new node
        rear = newNode;             // move rear to new node
    }

    // Dequeue operation
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) rear = null; // If queue becomes empty
        return dequeuedValue;
    }

    // Peek operation (front element)
    int peek() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    boolean isEmpty() {
        return front == null;
    }
}
