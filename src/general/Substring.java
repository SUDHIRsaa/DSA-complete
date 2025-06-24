package general;

import java.util.HashMap;

public class Substring {
    public static void main(String[] args) {
        
      
        String s="floewer";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                // System.out.print(s.substring(i, j+1)+" ");
            }
            
        }
          String arr[]={"flower","flow","flight"};
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                for (int j2 = j; j2 < arr[i].length(); j2++) {
                    System.out.print(arr[i].substring(j, j2+1)+" ");
                    
            
                }
            
            }
            System.out.println(); 
            
          }


    }
}
