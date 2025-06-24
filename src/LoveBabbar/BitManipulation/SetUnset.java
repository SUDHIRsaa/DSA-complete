package LoveBabbar.BitManipulation;


public class SetUnset {
    public static void main(String[] args) {
        PrintBits.print(32);
        int res=SetBit(32, 0);
        int res2=SetBit(32, 1);
        int res3=SetBit(32, 4 );

        
        System.out.println("\t");
        // PrintBits.print(res);
        // System.out.println("\t");
        // PrintBits.print(res2);
        // System.out.println("\t");
        // PrintBits.print(res3);

        int ans=UnSetBit(32, 5);
        PrintBits.print(ans);
         
    }
    public static int SetBit(int num,int bit){
        return  num | (1<<bit);
    }
    public static int UnSetBit(int num,int bit){
        return  num & ~(1<<bit);
    }
    
}
