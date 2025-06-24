package LoveBabbar.String;

public class TitleExcel {
    public static void main(String[] args) {
        
        StringBuilder ans=new StringBuilder();
        ans.reverse();
        int number=89;
        // while(number>0){
        //     number--;
           

        //     System.out.println((char)(number%26 +'A'));
        //     number/=26;

           
      
        // }   
        String a="ZY";
        int res=0;
        for (int i = 0; i < a.length(); i++) {
            int c=a.charAt(i)-'A'+1;
            System.out.println(c);
            res=res*26+c;
            System.out.println(res);
        }
        System.out.println(res);
   
    }
}
