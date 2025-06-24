package LinkedList;

public class MiddleOfsinglyLinkedList {
    public static void main(String[] args) {
       MiddleOfsinglyLinkedList mll=new MiddleOfsinglyLinkedList();
       mll.InsertAtBeginning(8);
       mll.InsertAtBeginning(7);
       mll.InsertAtBeginning(6);
       mll.InsertAtBeginning(5);
       mll.InsertAtBeginning(4);
       mll.InsertAtBeginning(3);
       mll.InsertAtBeginning(2);
       mll.InsertAtBeginning(1);
        
        mll.traverse();
        System.out.println(mll.lengthofll());
        System.out.println(mll.middle());
        MiddleOfsinglyLinkedList mll2=new MiddleOfsinglyLinkedList();
        for(int i=mll.lengthofll();i>=mll.middle();i--){
            mll2.InsertAtBeginning(i);
        }
        mll2.traverse();
    }
    Node head=null;
    public void InsertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int lengthofll(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    public int  middle(){
        int a=lengthofll();
        int count=0;
        if(a%2!=0){
            count=a/2 +1;

        }
        else{
            count=a/2+1;
        }
        return count;

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
}

class Npde{
    int data;
    Node next;
    public Npde(int data) {
        this.data = data;
        this.next=null;
    }
    public Npde(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    
}