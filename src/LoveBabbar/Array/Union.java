package LoveBabbar.Array;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int arr1[] = { 0,11, 21, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 21, 23, 4, 4, 5, 11, 12 };
        // Uni(arr1, arr2);
        Uni(arr1, arr2);

    }

    // USing Set
    public static ArrayList<Integer> Uni(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>(set);
        arr.sort(null);
        // Collections.sort(arr);
        System.out.println(arr);

        return arr;
    }

    // USing hash
    public static ArrayList<Integer> Uni2(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            hash.put(arr1[i], hash.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            hash.put(arr2[i], hash.getOrDefault(arr2[i], 0) + 1);
        }

        System.out.println(hash);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int it : hash.keySet())
            arr.add(it);

        return arr;

    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
