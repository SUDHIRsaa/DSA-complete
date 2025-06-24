package Interview;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int ans=1;
        for(int i=1;i<=6;i++){
            for(int j=0;j<i;j++){
                System.out.print(ans+" ");
                ans+=2;
              
               
            }
            System.out.println();
        }
    }
    
}
