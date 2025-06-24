package Recursion;

import java.net.Socket;

public class ReverseNumber {
    public static void main(String[] args) {

        
        String s = "60000";
        String reversed = Reverse(s, s.length() - 1);
        int num=Integer.parseInt(reversed);
        System.out.println(reversed);
        int a=60000;
        int res=0;
        res=ReverseNumber(a,res);
        System.out.println(res);
    }


    // Reverse A String 
    public static String Reverse(String s, int n) {
        if (n < 0) return ""; // Base case: if index is less than 0, return empty string
        return s.charAt(n) + Reverse(s, n - 1); // Append current character and recurse
    }





    // Reverse A Number 
    public static int ReverseNumber(int n, int reversed) {
        if (n == 0) return reversed; 
        int lastDigit = n % 10; 
        reversed = reversed * 10 + lastDigit; 
        return ReverseNumber(n / 10, reversed); 
    }

}
