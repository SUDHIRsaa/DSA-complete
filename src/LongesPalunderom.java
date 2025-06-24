import java.util.HashMap;

public class LongesPalunderom {
    public static void main(String[] args) {
        String s="ab";
        String arr[]=s.split(" ");
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
            
        }
        HashMap<String,Integer> hash2= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hash2.put(arr[i],hash2.getOrDefault((arr[i]),0)+1);
        }
        System.out.println(hash2.values());
        
        String patterns[]={"a","a","a"};
        LongesPalunderom obj=new LongesPalunderom();
       System.out.println( obj.numOfStrings(patterns, s));
    
    }
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            for(int j=0;j<patterns[i].length();j++){
                if(word.contains(patterns[i])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
 
    
}

