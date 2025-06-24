package Recursion.Striver;

public class basicsquestion {
   
    public static void main(String[] args) {
        // name("sudhir",0);
        // number(1, 6);
        // numberrev(7, 1);
        // numberbac(5, 5);
        // numberrevbac(1, 7);
        int arr[]= {1,2,3,4,5};
        int i=0;
        int n=arr.length-1;
        reversearray(arr, i, n);
        for (int j : arr) {
            System.out.println(j);
        }
    }


     // print name 5 times 
     public static void name(String name,int count){
        
        if(count==5){
            return;
        }
        count++;
        System.out.println(name + " "  + count);
        name(name,count);

     }



    //  print from 1 to n
    public static void number(int a,int n){
        if(a>n){
            return;
        }
        
        System.out.println(a);
        number(a+1, n);
        


    }


     //  print from n to 1 
     public static void numberrev(int a,int n){
        if(a<n){
            return;
        }
        
        System.out.println(a);
        numberrev(a-1, n);


    }

    //  print from 1 to n backtracking
    public static void numberbac(int a,int n){
        if(a<1){
            return;
        }
        numberbac(a-1, n);
        
        System.out.println(a);


    }


     //  print from n to 1  backtracking
     public static void numberrevbac(int a,int n){
        if(a>n){
            return;
        }
        
        numberrevbac(a+1, n);
        System.out.println(a);


    }

    // Reverese an array 
    
    public static void reversearray(int arr[], int i, int n) {
        if (i >= n) { // Base condition
            return;
        }

        swap(arr, i, n); // Fix: Pass array to swap function
        reversearray(arr, i + 1, n - 1); // Fix: Decrease `n`
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
