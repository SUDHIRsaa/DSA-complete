package LoveBabbar.BitManipulation;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        SwapTwoNumbers(-15, 12);
         
    }
    public static void SwapTwoNumbers(int a ,int b){
        System.out.println(a + " " + b);
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.println(a + " " + b);
    }
    
}
