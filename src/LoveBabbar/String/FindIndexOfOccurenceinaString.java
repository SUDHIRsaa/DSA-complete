package LoveBabbar.String;

public class FindIndexOfOccurenceinaString {
    public static void main(String[] args) {
        String  haystack = "sadbutsad";
        String needle = "sad";
        for(int i=0;i<haystack.length();i++){
            for(int j=i;j<haystack.length();j++){
                if(haystack.substring(i,j+1).equals(needle)){
                    System.out.println(i );
                }
            }
                // if(haystack.substring(0,i)==needle){
                //     System.out.println("true");
                // }
                // else{
                //     System.out.println("false");
                // }
          
                
        }
    }
}
