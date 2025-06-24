package LoveBabbar.String;

import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        HashMap<String,Integer> hash= new HashMap<>();
        String ss[]=new String[3];
        String ans="";
        String arr[] = {"dog","racecar","car"};
        for (String i : arr) {
             for (int j = 0; j < i.length(); j++) {
                for (int j2 = j; j2 < i.length(); j2++) {
                    // System.out.print(i.substring(j, j2+1)+" ");
                    hash.put(i.substring(j, j2+1), hash.getOrDefault(i.substring(j, j2+1), 0)+1);
            
                }
            
            }
           
        }
    
        int max=0;
        for (String string : ss) {
            if(string.length()>max){
                max=string.length();
                ans=string;
            }
        }
     System.out.println(ans);
    }
    
}
