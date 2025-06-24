package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
       int res= Natural(5);
       System.out.println(res);

    }
    public static int Natural(int n){
        if(n<=0) return n;
                
        return (n + Natural(n-1));

    }
}
