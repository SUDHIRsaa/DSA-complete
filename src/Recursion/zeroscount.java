package Recursion;

public class zeroscount {
    public static void main(String[] args) {
        zeros(1002303);
        
    }
    static void zeros(int a){
        int count=0;
       String ss= String.valueOf(a);
       char c[]= ss.toCharArray();
       int aa[]= new int [c.length];
       
       for (int i=0;i<c.length;i++){

         aa[i]= Character.getNumericValue(c[i]);
        if (aa[i]==0){
            count++;
           
            
        }
        // System.out.println(c[i]);
      
       }
       System.out.println(count);
       
    }
    
    static void zeross(int a) {
        int count = 0;
        
        while (a > 0) {
            if (a % 10 == 0) { // Check if the last digit is zero
                count++;
            }
            a /= 10; // Remove the last digit
        }
        
        System.out.println("Number of zeros: " + count);
    }



    
    // USING RECURSION
    static int countZeros(int n) {
        if (n == 0) {
            return 0;
        }
        
        // Check if the last digit is zero and add 1 to count if true
        int count = (n % 10 == 0) ? 1 : 0;
        
        // Recur with the number divided by 10 (removes the last digit)
        return count + countZeros(n / 10);
    }
}

