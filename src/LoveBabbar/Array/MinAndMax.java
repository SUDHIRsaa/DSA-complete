package LoveBabbar.Array;

public class MinAndMax {
    public static void main(String[] args) {
        int arr1[] =  {2,5,1,3,33};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
        System.out.println("The Largest element in the array is: "+findMinalElement(arr1));
     
        int arr2[] =  {8,10,5,7,9,-1};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
        System.out.println("The Largest element in the array is: "+findMinalElement(arr2));
    }
    static int findLargestElement(int arr[]) {
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
            max= arr[i];
          }
        }
        return max;
      }
    static int findMinalElement(int arr[]) {
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] < min) {
            min= arr[i];
          }
        }
        return min;
      }
}
