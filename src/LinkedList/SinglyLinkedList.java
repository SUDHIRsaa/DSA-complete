package LinkedList;

public class SinglyLinkedList {

    Node head = null;

    public void InsertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void InsertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Position must be >= 1");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }
    public void deleteBynode(int data){
        
        Node temp=head;
        Node ptr=temp.next;
        while(ptr.data!=data){
            temp=ptr;
            ptr=ptr.next;

        }
        temp.next=ptr.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int pos) {
        if (pos < 1) {
            System.out.println("Position must be >= 1");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.InsertAtBeginning(20);
        ll.InsertAtBeginning(12);
        ll.InsertAtBeginning(10);
        ll.InsertAtEnd(30);
        ll.InsertAtEnd(40);
        ll.InsertAtEnd(50);
        ll.InsertAtEnd(60);
        ll.InsertAtPosition(25, 4);
        
        ll.deleteBynode(25);
        ll.traverse();
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
