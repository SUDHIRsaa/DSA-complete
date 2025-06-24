package general;


public class ReverseInteger {
    public static void main(String[] args) {
        int x=2111;
        int y=0;
        while(x>0){
            y=x%10;
            x=x/10;
            
            System.out.print(y);
        }
        
        
        

    }
    
}
