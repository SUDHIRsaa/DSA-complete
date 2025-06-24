import java.util.*;

public class Exam {
    public static void main(String[] args) {
       int nums[]={4,3,2,7,8,2,3,1};
       Arrays.sort(nums);
       int n=nums.length;
       List<Integer> ls=new ArrayList<>();
       for(int i=1;i<nums.length;i++){
            if(nums[i]==i){
                ls.add(i);
                
                
                
            }
       }    
       
           
}
}
