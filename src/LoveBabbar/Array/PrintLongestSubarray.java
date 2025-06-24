package LoveBabbar.Array;

import java.util.ArrayList;

public class PrintLongestSubarray {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 7, 10};
        ArrayList<Integer> result = lonhgg(arr, 14);
        System.out.println("Longest Subarray: " + result);
        System.out.println("Length: " + result.size());
    }
    
        public static ArrayList<Integer> lonhgg(int arr[], int k) {
        int maxx = 0;
        int l = 0;
        int sum = 0;
        int start = 0, end = 0; 
        ArrayList<Integer> subarray = new ArrayList<>();

        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];

          
            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            if (r - l + 1 > maxx) {
                maxx = r - l + 1;
                start = l;
                end = r;
            }
        }

        
        for (int i = start; i <= end; i++) {
            subarray.add(arr[i]);
        }

        return subarray;
    }

}
