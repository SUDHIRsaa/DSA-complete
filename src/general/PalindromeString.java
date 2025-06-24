
package general;
public class PalindromeString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama\"";
       System.out.println( isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
 
         
         String ans = "";
 
         // Step 3: Reverse the cleaned string
         for (int i = a.length() - 1; i >= 0; i--) {
             ans += a.charAt(i); // Append characters to form the reversed string
         }
 
         // Step 4: Compare the cleaned string with the reversed version
         return a.equals(ans);
     }
      
        public static boolean issPalindrome(String s) {
            // Step 1: Remove non-alphanumeric characters and convert to lowercase
            String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
            // Step 2: Reverse the cleaned string
            StringBuilder reversed = new StringBuilder(cleaned).reverse();
    
            // Step 3: Check if the cleaned string is equal to its reverse
            return cleaned.equals(reversed.toString());
        
    }
    
}
