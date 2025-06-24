package general;
import java.util.*;

public class TwoDarray{
    public static void main(String[] args) {
        // twod();
        int[][] ans = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        int row= ans.length;       
        int col = ans[0].length;   

     
        System.out.println("Number of rows: " + row);
        System.out.println("Number of columns: " + col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); 
        }
        System.err.println("\t");

        // Transpose  of a matrix
        for (int j = 0; j < col; j++) {
                 for (int i = 0; i < row; i++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); 
        }

        // Reverese row 
        int n=ans.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap elements matrix[i][j] and matrix[i][n - 1 - j]
                int temp = ans[i][j];
                ans[i][j] = ans[i][n - 1 - j];
                ans[i][n - 1 - j] = temp;
            }
        }
    }

    
    public static void twod(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        
        int[][] ans=new int[row][col];
        System.out.println("Enter the values for the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for ans[" + i + "][" + j + "]: ");
                ans[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); 
        }
        

    }

}