package  Recursion.Striver;
import java.util.ArrayList;
import java.util.List;

public class Subsequence{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        ArrayList<Integer> ls = new ArrayList<>();
    List<Integer> ls1 = new ArrayList<>();

        Arryapattern(0, arr, ls, arr.length);

    }
    
    public static void Arryapattern(int i,int arr[],ArrayList<Integer> ls,int n) {
        if(i==n){
            System.out.println(ls);
            return;
        }
    
        ls.add(arr[i]);
        Arryapattern(i+1, arr, ls, n);
        ls.remove(ls.size()-1);
        Arryapattern(i+1, arr, ls, n);

     
     
    }
    
}