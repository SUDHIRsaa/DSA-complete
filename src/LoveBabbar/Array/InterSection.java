package LoveBabbar.Array;

import java.util.*;;
public class InterSection {
    
    public static void main(String[] args) {
        int arr1[] = { 1,2,2,1};
        int arr2[] = { 2,2 };
        ArrayList<Integer> ar =  interSec(arr1, arr2);
        // Integer ans[] =new Integer[ar.size()];
        // ar.toArray(ans);
        // for (int num : ans) {
        //     System.out.print(num + " ");
        // }
    //   ArrayList<Integer> ar =  FindInt(arr1, arr2, arr1.length, arr2.length);
      
    }

    static ArrayList<Integer> FindInt(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Intersection = new ArrayList<>(); // Intersection vector
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) { // Common element found
                if (Intersection.size() == 0 || Intersection.get(Intersection.size() - 1) != arr1[i]) {
                    Intersection.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) { // Move pointer in arr1
                i++;
            } else { // Move pointer in arr2
                j++;
            }
        }
        System.out.println("Intersection: " + Intersection);
        return Intersection;
    }


    // Using HashSet
    public static ArrayList<Integer> interSec(int arr1[] ,int arr2[])
    {
        HashMap<Integer,Integer> hash= new HashMap<>();
        
        for (int i = 0; i < arr1.length; i++) {
            hash.put(arr1[i], hash.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            hash.put(arr2[i], hash.getOrDefault(arr2[i], 0) + 1);
        }
            
        ArrayList<Integer> ar = new ArrayList<> ();
        for(int x:hash.keySet()){
           if(hash.get(x) > 1) {
            ar.add(x);
           }
        }
        System.out.println("Keys with values greater than 1: " + ar);
        return ar;

    }
}
