package LoveBabbar.Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        // sc.nextLine();
        // String ss="";
        // while(t-->0){
        //      ss=sc.nextLine();
        //      System.out.println(Reverse(ss));
        // }

        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]= new int[t];
        System.out.println("Enter " + t + " elements:");
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i = 0; i < t; i++) {
            System.out.print(arr[i] + " ");
        }

        ReverseArray(arr);
        for (int i = 0; i < t; i++) {
            System.out.print(arr[i] + " ");
        }

        
        
    }
    public static String Reverse(String s){

        int a = s.length();
        if(a==0) return "";
        char[] ch= s.toCharArray();
        int l=0; int r=a-1;
        while( l<r){
            char c = ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;


        }

        return new String(ch);


    }

    public static int[] ReverseArray(int arr[]){
        
        int a = arr.length;
        if(a==0) return arr;
        
        int l=0; int r=a-1;
        while( l<r){
            int  c = arr[l];
            arr[l]=arr[r];
            arr[r]=c;
            l++;
            r--;


        }


        return arr;
    }
}
