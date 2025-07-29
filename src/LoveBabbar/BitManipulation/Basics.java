package LoveBabbar.BitManipulation;

public class Basics{
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011
        if ((a& 1) == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

        System.out.println("a & b  = " + (a & b));   // 1
        System.out.println("a | b  = " + (a | b));   // 7
        System.out.println("a ^ b  = " + (a ^ b));   // 6
        System.out.println("~a     = " + (~a));      // -6
        System.out.println("a << 1 = " + (a << 1));  // 10
        System.out.println("a >> 1 = " + (a >> 1));  // 2
        System.out.println("-a >> 1 = " + (-a >> 1));  // -3
        System.out.println("-a >>> 1 = " + (-a >>> 1)); // large positive
    }
}
