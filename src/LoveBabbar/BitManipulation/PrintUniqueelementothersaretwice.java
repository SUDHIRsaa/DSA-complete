package LoveBabbar.BitManipulation;

public class PrintUniqueelementothersaretwice {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,10,10,11,11,12};
        uniq(arr);

    }    
    public static void uniq(int arr[]) {
        int res=0;
        
        for(int i=0 ;i<arr.length;i++){

            res=res ^ arr[i];               
        }
        System.out.println(res);
    }                   
    
}
