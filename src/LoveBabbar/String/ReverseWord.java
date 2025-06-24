package LoveBabbar.String;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        s.trim();
       
        String[ ] arr= s.split("\\s+");
        for (String string : arr) {
            System.out.println(string);
            
        }
        String ans="";
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i]+" ";
            
        }
        

    }
    
}
