package Twopointer;
public class LongestSubarray {
    
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int a=lonhgg(arr, 14);
        System.out.println(a);

        
    }

    // brute o(n2)
    public static int lonh(int arr[],int k){
        int maxx=0;
        for(int i=0;i<arr.length;i++){
                int sum=0;

            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<=k){
                    maxx=Math.max(maxx,j-i+1);

                }
                else if (sum>k){
                    break;
                }
            }
        }


        return maxx;
    }
// Better o(2n)
public static int lonhg(int arr[],int k){
    int maxx=0;
    int l=0 ;int r=0;int sum=0;
    
    while(r<arr.length){
        sum=sum+arr[r];
        while(sum>k){
            sum=sum-arr[l];
            l++;

        }
        if(sum<=k){
            maxx=Math.max(maxx,r-l+1);
            
        }




        r++;
    }


    return maxx;
}
// optimal o(n)
public static int lonhgg(int arr[],int k){
    int maxx=0;
    int l=0 ;int r=0;int sum=0;
    
    while(r<arr.length){
        sum=sum+arr[r];
        if(sum>k){
            sum=sum-arr[l];
            l++;

        }
        if(sum<=k){
            maxx=Math.max(maxx,r-l+1);
            
        }




        r++;
    }


    return maxx;
}
}
