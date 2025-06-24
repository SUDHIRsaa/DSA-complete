package BinarySearch;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] ={4,5,6,7,0,1,2};
        int target=0;
        int ans=search(nums, target);
        System.out.println(ans);
        
    }
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int f=nums[0];
         int ans=-1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int temp=nums[0];
            
            for(int j=0;j<nums.length-1;j++){
                nums[j]=nums[j+1];         
            }
            nums[n-1]=temp;
            for (int j=0;j< nums.length;j++) {
                System.out.print(nums[j]);
                
            }
            System.out.println("\n");
            if(nums[0]==f){
                
                binary(nums, target);
                
        }
        else{
            continue;
        }

           

        }
        return ans;
    }
    public static int binary(int nums[],int target){
                    int start=0;
                    int ans=-1;
                   int end=nums.length-1;
                    while(start<=end){
                   int mid=start+(end-start)/2;
                   if(nums[mid]<target){
                             start=mid+1;
                   
               }
               else if (nums[mid]>target){
                   end=mid-1;
                   
               }
               else{
                      ans=mid;
                       return ans; //
               }
               
           }
           return ans;
          
    }
    
}
