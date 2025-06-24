package LoveBabbar.BitManipulation;

public class ClearLSBandMSB {
    public static void main(String[] args) {
        PrintBits.print(63);
        int a=ClearLsb(63, 4);
        System.out.println("\t");
        PrintBits.print(a);
        int b=ClearRsb(63, 4);
        System.out.println("\t");
        PrintBits.print(b);
        System.out.println("\t");
        PrintBits.print(63);
    }
    public static int ClearLsb(int num ,int bit){
        return num & ~((1 << (bit + 1)) - 1); 
    }
    public static int ClearRsb(int num ,int bit){
        return num & ((1 << (bit + 1)) - 1); 
    }
    
}
