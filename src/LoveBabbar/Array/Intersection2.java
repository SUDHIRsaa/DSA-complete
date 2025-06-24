package LoveBabbar.Array;

import java.util.HashMap;

public class Intersection2 {
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        HashMap<Integer,Integer> hash= new HashMap<>();
        for (int i=0;i<arr1.length;i++) {
            hash.put(arr1[i],hash.getOrDefault(arr1[i],0)+1);

            
        }
        System.out.println(hash.keySet());

        
    }
}
