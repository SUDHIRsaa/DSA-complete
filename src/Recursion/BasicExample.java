package Recursion;

public class BasicExample {
    public static void main(String[] args) {
    //    for(int i=0;i<5;i++){
    //     message(1);
    //    }

    message(3);

    
    }
    static void message(int n){
        if(n==5){
           System.out.println("hello");
            return;
        }
        
        System.out.println("hello");
        message(n+1);
       
    }
    
}
