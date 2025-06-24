

public class Just {
    public static void main(String[] args) {
      int nums[]= {3,30,34,5,9};
      String ans="";
      int max=nums[0];
      for (int i = 0; i < nums.length; i++) {
        int num=nums[i];
        int temp=0;
        while(num>0){
            temp=num%10;
            num=num/10;

        }
        
        if(temp>max){
            max=temp;
        }

    }
    System.out.println(ans);
      
       
    }

}
