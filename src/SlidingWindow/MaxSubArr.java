package SlidingWindow;

public class MaxSubArr{
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int  k = 3;
        int max=0;
        for(int i=0;i<arr.length;i++){
            int j=i;
            int sum=0;
            while(j<=k){
                sum=sum+arr[j];
                max=Math.max(sum,max);
                

                j++;

            }

        }
        System.out.println(max);
    }
    
}