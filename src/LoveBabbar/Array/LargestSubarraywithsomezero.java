package LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class LargestSubarraywithsomezero {
    public static void main(String[] args) {
        int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};
       int a= maxLen(arr);
        System.out.println(a);

        
    }
    public static  int maxLen(int arr[]) {
         int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            List<Integer> ls= new ArrayList<>();
            for(int j=i;j<n;j++){
                   sum+=arr[j];
                    
                    ls.add(arr[j]);
                    if(sum==0){
                       
                        max=Math.max(max,ls.size());
                    }
                
                
            }
        }
        return max;
    }
    
}
