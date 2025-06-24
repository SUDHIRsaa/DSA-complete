package LoveBabbar.String;

public class Experiment {
    public static void main(String[] args) {
        String s="this is a CODECHEF problEM";
       String a[] =s.split(" ");
       for (String string : a) {
        
          String ans= Character.toUpperCase(string.charAt(0))+string.substring(1);
           System.out.println(ans);
       }
       String res=String.join(" ",a);
       System.out.println(res);
    }
}
