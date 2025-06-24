package Recursion;

public class ArrayOperation {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int arr1[]={10,20,30,10,40,50,60};
        reverseddisplay(arr, 0);
        System.out.println("\t");
        // display(arr, 0);
    }
    public static void display(int arr[],int n){
        if(n==arr.length){
            return;
        }
        System.out.println(arr[n]);
        display(arr, n+1);
    }
    public static void reverseddisplay(int arr[],int n){
        if(n==arr.length){
            return;
        }
        reverseddisplay(arr, n+1);
        System.out.println(arr[n]);
    }
 
    
}
