package LoveBabbar.Array;
import java.util.*;

public class AddtoArrayformofInteger {
    public static void main(String[] args) {
        int num[]={1,2,0,0};
        int k=34;
        String ans="";
        for(int i:num){
            ans+=String.valueOf(i);
            
        }
        long one=(long) Integer.parseInt(ans);
        long three=one +k;
         String numStr = Long.toString(three);
        List<Integer> ls= new ArrayList<>();
        for (int i = 0; i < numStr.length(); i++) {
             ls.add(Character.getNumericValue(numStr.charAt(i)));
        }
        
        for (Integer integer : ls) {
            System.out.println(integer);
            
        }


    }
    
}
