package LoveBabbar.BitManipulation;

public class Toggle {
    public static void main(String[] args) {
        PrintBits.print(23);
        int res=Toggle(23, 1);
        System.out.println("\t");
        PrintBits.print(res);
    }
    // XOR
    public static int Toggle(int num ,int bit){
        return num ^ (1<<bit);
    }
    
}
