package Twopointer;

public class MaxConsecutiveones {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(maxxx(nums, k));
        System.out.println(maxxx(nums, k));
        System.out.println("hello");

        
    }
    public static int maxxx(int arr[],int k){
        int max=0;
        int zero=0;
        int start=0;
        int end;
        for(end=0;end<arr.length;end++){
            if(arr[end]==0){
                zero++;

            }
            while(zero>k){
                if(arr[start]==0){
                    zero--;
                }
                start++;
            }
            max=Math.max(max, end-start+1);
        }
        return max;
    }
}
