package LoveBabbar.BitManipulation;

public class PowerOftwo {
    public static void main(String[] args) {
        
        Ispower(-4);
    }
    public static void Ispower(int num){
        if((num & num-1)==0){
            System.out.println("Yes ");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
