package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String a="aahhsshsh";
        String b="netlhis";
        String arr[]={"eat","tea","ate","ten","tenb"};
        for(int i=0;i<arr.length-1;i++){
            List<List<String>> ls=new ArrayList<>();
                for(int j=i+1;j<arr.length-1;j++){
                        if(isAnagram(arr[i], arr[j])){
                                ls.add(Arrays.asList(arr[i],arr[j]));
                                System.out.println(ls);
                                break;
                        }
                        else{
                           
                            ls.add(Arrays.asList(arr[j]));
                            System.out.println(ls);

                        }
                        
                }

        }
       

    }
    public static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }

        int[] charCount = new int[26];
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    
}
