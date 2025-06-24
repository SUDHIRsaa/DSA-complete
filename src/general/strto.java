package  general;


public class strto{
    public static void main(String[] args) {
        String a="342";
        String b="465";
        int ans=Integer.valueOf(a);
        String res=String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
        // System.out.println(res);
        for(int i=1;i<4;i++){
            a=i+a;
            System.out.println(a);

        }

        
        
        
    }

}