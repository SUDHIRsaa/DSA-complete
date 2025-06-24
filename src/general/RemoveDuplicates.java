package general;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String a = "ansansansio";
        String ans = ""; 

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < ans.length(); j++) {
                if (ans.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break; 
                }
            }

          
            if (!isDuplicate) {
                ans += currentChar; 
            }
        }

        
        System.out.println(ans);
    }
}
