package LoveBabbar.BitManipulation;

public class ithBitset {
    
    public static void main(String[] args) {
        if(isbit(2, 0)){
            System.out.println("hm");
        }
        else{
            System.out.println("jf");
        }
        
    }
    public static boolean isbit(int num,int bit) {
        int res= num & (1<<bit);
        return (res==0) ? false: true;

        
    }
}
