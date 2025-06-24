package LoveBabbar.Stack;

import java.util.Scanner;

public class MenuDrivenforstack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Display Size");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    if (stack.size() > 0) {
                        System.out.println("The element popped is: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (stack.size() > 0) {
                        System.out.println("The top element is: " + stack.top());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Current size of the stack: " + stack.size());
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Stack {
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int x) {
        if (top < size - 1) {
            top++;
            arr[top] = x;
            System.out.println("Element pushed.");
        } else {
            System.out.println("Stack is full.");
        }
    }

    int pop() {
        if (top >= 0) {
            int x = arr[top];
            top--;
            return x;
        } else {
            System.out.println("Stack is empty.");
            return -1; // return an invalid value to indicate empty stack
        }
    }

    int top() {
        if (top >= 0) {
            return arr[top];
        } else {
            System.out.println("Stack is empty.");
            return -1; // return an invalid value to indicate empty stack
        }
    }

    int size() {
        return top + 1;
    }
}