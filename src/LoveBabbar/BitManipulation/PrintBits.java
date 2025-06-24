package LoveBabbar.BitManipulation;

public class PrintBits {
    public static void main(String[] args) {
        
        print(300);
    }

    // 1 
    public static void print(int nums){
        for(int i=7;i>=0;i--){
            System.out.print((nums>>i)&1);
        }
    }

    // 2
    public static void printUsingToBinaryString(int nums) {
        System.out.println(Integer.toBinaryString(nums));
    }


    // 3
    public static String convertIntegerToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber.append(remainder);
            n /= 2;
        }
        binaryNumber = binaryNumber.reverse();
        return binaryNumber.toString();
    }


    // 4
    public static String convertIntegerToBinarym(int n) {
        if (n == 0) {
            return "0";
        }
        String binaryNumber = "";
        while (n > 0) {
            int remainder = n % 2;
            binaryNumber = remainder + binaryNumber; // Concatenate at the beginning
            n /= 2;
        }
        return binaryNumber;
    }
    
    
}
