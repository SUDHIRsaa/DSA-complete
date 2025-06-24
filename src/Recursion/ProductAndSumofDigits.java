package Recursion;

public class ProductAndSumofDigits{
    public static void main(String[] args) {
        int ans1 = sumdigit(12345);
        System.out.println(ans1);
    }



    
    // normal method
    public static void digit(int n) {

        String a = String.valueOf(n);
        System.out.println(a);
        char b[] = a.toCharArray();
        int sum = 0;
        for (int i = 0; i < b.length; i++) {

            sum = sum + b[i] - '0';
            

        }
        System.out.println(sum);
    }




    // recursion method
    public static int sumdigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumdigit(n / 10);

    }

    public static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * product(n / 10);

    }

}
