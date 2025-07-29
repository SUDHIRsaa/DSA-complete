package LoveBabbar.BitManipulation;

public class IsoddOreven {
    public static void main(String[] args) {
        if(isbit(9, 0)){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

        
    }
    public static boolean isbit(int num,int bit) {
        int res= num & (1<<bit);
        return (res==0) ? false: true;

        
    }
}
