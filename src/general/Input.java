package general;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the " + (i+1) +" element in array");
            int a=sc.nextInt();
            arr[i]=a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            
        }

        
    }
    
}
