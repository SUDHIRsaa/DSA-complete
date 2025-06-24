package Recursion;

public class TowerOfhanoi {
    
    public static void main(String[] args) {
        int n=3;
        TowerOfhanoi(n, "A", "B", "C");
    }
    public static void TowerOfhanoi(int a,String source,String helpher,String dest){
        if(a==1){
            System.out.println("transfer disk " + a + " from " + source + " destination " + dest);
            return;
        }
        TowerOfhanoi(a-1, source, dest, helpher);
        System.out.println("transfer disk " +  a + " from " + source + " destination " + dest);
        TowerOfhanoi(a-1, helpher,source, dest);
        



    }
}
