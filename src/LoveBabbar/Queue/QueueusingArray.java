package LoveBabbar.Queue;

public class QueueusingArray {
    public static void main(String[] args) {
        Queue q= new Queue();
        for (int i = 1; i < 10; i++) {
            System.out.println("Element pushed " + q.push(i));
        }
        System.out.println("Elelment poped out " + q.pop());
        System.out.println("First element is "+ q.peek());
        System.out.println("Size is  "+ q.size());
    }
    
    
}
class Queue{
    int arr[]=new int[1000];
    int first=0;
    int  push(int x){
        first++;
        arr[first]=x;
        return x;
        
    }
     int pop(){
        int x=arr[0];
        first--;
        return x;

        
    } 
     int peek(){

        return arr[0];
     }
     int size(){
        return first+1;
     }


    
}
