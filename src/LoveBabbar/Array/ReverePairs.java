package LoveBabbar.Array;

public class ReverePairs {
    public static void main(String[] args) {
        int arr[]={2,4,3,5,1};
       int a= reversePairs(arr);
       System.out.println(a);

    }

    public static int reversePairs(int[] nums) {
      
        int count=0;
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i< j && nums[i] >2 *nums[j]){
                    count++;
                }
            }

        }
        
       
       
       return count;
    }
    
}
