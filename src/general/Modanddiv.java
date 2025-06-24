package general;

public class Modanddiv {
    public static void main(String[] args) {
        int x=2365;
        // while(x>0){
            
        //     x=x/10;
            
        //     System.out.print(x+ " ");
            
        // }
        int ans=0;
        while(x>0){
            
             ans=x%10; // 5  6   7  2 
             x=x/10; //236 23 2  0
            
             
             System.out.print(ans+ " " );
             System.out.println(x+ " " );
        }
    }
    
}
