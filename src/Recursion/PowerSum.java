package Recursion;

public class PowerSum {
    public static void solve(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i,3);

        }
        System.out.print(sum);

    }
    public static void main(String[] args) {
        // solve(6);
        System.out.println("\t");
        solve(2);
    }
}
