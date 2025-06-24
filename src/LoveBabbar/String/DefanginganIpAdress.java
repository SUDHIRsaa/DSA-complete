package LoveBabbar.String;

public class DefanginganIpAdress {
    public static void main(String[] args) {
        String address="1.1.1.1";
        
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
          if(address.charAt(i)=='.'){
            ans.append("[.]");
          }
          else{
            ans.append(address.charAt(i));
          }
            
        }
        System.out.println(ans);
        
       
    }
    

}