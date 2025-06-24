package LoveBabbar.BitManipulation;

public class NoOfSetBits {
    public static void main(String[] args) {
        PrintBits.print(23);
        System.out.println("\t");
        int a=Noofbits(23);
        System.out.println(a);
        int aa=UnSetRightMostBit(23);
        PrintBits.print(aa);
        
    }
    public static int Noofbits(int num){
        int count=0;
        
        while(num!=0){
            count++;
            num=UnSetRightMostBit(num);
        }

        return count;
    }

    public static int UnSetRightMostBit(int num){
       return (num & num-1);
    }
    
}
