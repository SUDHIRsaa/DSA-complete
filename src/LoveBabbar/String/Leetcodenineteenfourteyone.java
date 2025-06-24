package LoveBabbar.String;


import java.util.HashMap;

public class Leetcodenineteenfourteyone {

    public static void main(String[] args) {
        String s="vvvvvvvvvvvvvvvvvvv";
         HashMap<Character,Integer> hash=new HashMap<>();
         boolean ans;
        for(int i=0;i<s.length();i++){
                hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        }
        for (Character key : hash.keySet()) {
            System.out.println(hash.get(key));
           
            if(hash.get(key)%2==0){
                ans=true;
                System.out.println(ans);
            }
            else{
                ans=false;
                System.out.println(ans);
            }
        }
    }
}

