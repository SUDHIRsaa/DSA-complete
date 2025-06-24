package LoveBabbar.String;

public class LargestOddNumber {
    public static void main(String[] args) {
        String num="1";
        int max=0;
        for(int i=0;i<num.length();i++){
            int ans=0;
            for(int j=i+1;j<num.length();j++){
                if( num.length()==1){
                    ans=1;
                }
                    else if(num.length()<=2){
                        ans=Integer.parseInt(num.substring(i,j));
                    }
                    else{
                        ans=Integer.parseInt(num.substring(i,j+1));
                    }
                    
                    System.out.println(ans);
                    if(ans%2!=0){
                        max=Math.max(ans,max);
                    }
                    
            }
            
            
        }
        String res=max+"";
        if(max==0){
            res="";
        }
        else if(max==1){
            res="1";

        }
        System.out.println("Largest Odd Number: " + res);
    }
    
}
