package LoveBabbar.Array;

public class LeftRotate {
    public static void main(String[] args) {
        int n=5;
  
  int arr[]= {1,2,3,4,5};
    solve(arr, n);
    }
    public static void solve(int arr[] ,int n){
      
        for(int j=0;j<3;j++){
            int temp=arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
              }
              arr[n-1] =temp;
              System.out.println("\t");
              for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
              }
            
        }
       
       
        
    }
}
