package LoveBabbar.Array;


import java.util.ArrayList;

public class AllSubarrays {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 10};
        ArrayList<ArrayList<Integer>> allSubarrays = getAllSubarrays(arr);
       
        for (ArrayList<Integer> subarray : allSubarrays) {
            System.out.println(subarray);
        }
    }

    public static ArrayList<ArrayList<Integer>> getAllSubarrays(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> subarray = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                subarray.add(arr[j]); // Add current element to subarray
                result.add(new ArrayList<>(subarray)); // Add copy of subarray to result
            }
            
        }

        return result;
    }
}
