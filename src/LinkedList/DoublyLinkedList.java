package LinkedList;

public class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void InsertAtBegning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }
    public void InsertAtPosition(int data,int Position){
        Node newNode=new Node(data);
        if(Position < 1 ){
            System.out.println("Position must be greater than 1");
        }
        else if(Position==1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else{
            Node temp=head;
            for(int i=1;i<Position-1;i++){
                if(temp==null){
                    System.out.println("Position out of bound");
                    return;
                }
                temp=temp.next;
            }

            newNode.next=temp.next;
            temp.next=newNode;
            newNode.prev=temp;
        }
        }

    public void InsertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {

                temp = temp.next;

            }
            temp.next = newNode;
            newNode.prev = temp;

        }

    }
    public  void  deleteAtBeginning(){
            if(head==null){
                System.out.println("List is empty");
            }
            else{
                head=head.next;
            }
    }
    public  void  deleteAtEnd(){
            if(head==null){
                System.out.println("List is empty");
            }
            else{
             Node temp=head;
             Node ptr=temp.next;
             while(ptr .next!=null){
                temp=ptr;
                ptr=ptr.next;
             }
             temp.next=null;




            }
    }
    public  void  deleteAtPosition(int Position){
            if(head==null){
                System.out.println("List is empty");
            }
            else if(Position==1){
                head=head.next;

            }
            else{
             Node temp=head;
             Node ptr=temp.next;
            for(int i=1;i<Position-1;i++){
                temp=ptr;
                ptr=ptr.next;
            }
                temp.next=ptr.next;




            }
    }

    public void traversal() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertAtBegning(0);
        dll.InsertAtBegning(10);
        dll.InsertAtBegning(20);
        dll.InsertAtBegning(30);
        dll.InsertAtEnd(50);
        dll.InsertAtEnd(50);
        dll.InsertAtEnd(350);
        dll.InsertAtEnd(150);
        dll.InsertAtEnd(250);
        dll.InsertAtPosition(55, 5);
        dll.InsertAtPosition(55, 1);
        dll.InsertAtPosition(55, 10);
        dll.InsertAtPosition(55, 5);
        // dll.deleteAtBeginning();
        // dll.traversal();
        // dll.deleteAtBeginning();
        
        dll.traversal();
        dll.deleteAtPosition(8);
        dll.deleteAtPosition(1);
        dll.traversal();
        dll.deleteAtPosition(1);
        dll.traversal();
    }

}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;

    }
}
