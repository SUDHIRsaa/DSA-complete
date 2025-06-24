package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonccis(22));
    }
    static int fibonccis(int n){
        if(n<2){
            return n;
        }
        
        return fibonccis(n-1)+fibonccis(n-2);
    }
    
}
