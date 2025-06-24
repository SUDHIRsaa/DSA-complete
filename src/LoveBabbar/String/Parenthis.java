package LoveBabbar.String;

import java.util.HashMap;
import java.util.HashSet;

public class  Parenthis{
    public static void main(String[] args) {
        String s="egg";
        String t="add";
      HashMap<Character,Integer> hash=new HashMap<>();
        HashMap<Character,Integer> hash1=new HashMap<>();
        for(int i=0;i<s.length();i++){
         hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            hash1.put(t.charAt(i),hash1.getOrDefault(t.charAt(i),0)+1);
        }
        
       HashSet<Integer> set1=new HashSet<>(hash.values());
       HashSet<Integer> set2=new HashSet<>(hash1.values());
       System.out.println(set1.equals(set2));

        
    }
}