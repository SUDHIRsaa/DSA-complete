package LoveBabbar.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthMaxMin {
    public static void main(String[] args) {
        


        // SIMPLE APPROACH 


        // int arr[] =  {2,5,1,3,33,11,5};
        
        // Arrays.sort(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
            
        // }
        // System.out.print("\n");
        // System.out.println(arr[arr.length-2]);
        int arr[] = {1, 2, 6, 4, 5, 3}  ;

        kth_Largest_MaxHeap(arr, 3)  ;
        kth_Smallest_MinHeap(arr, 3)  ;

        
    }
    static void kth_Largest_MaxHeap(int[] arr, int k) {

        PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->b-a);
        
        int n = arr.length  ;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i])  ;
        }

        int f = k - 1 ;

        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }

        System.out.println("Kth Largest element "+pq.peek())  ;
    }

    static void kth_Smallest_MinHeap(int[] arr, int k) {

        PriorityQueue<Integer>pq= new PriorityQueue<>();
        int n = arr.length  ;

        for (int i = 0; i < n; i++) {
            pq.add(arr[i])  ;
        }

        int f = k - 1 ;

        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }

        System.out.println("Kth Smallest element "+pq.peek())  ;
    }
    
}
