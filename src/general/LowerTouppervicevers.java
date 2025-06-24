package general;

import java.util.Scanner;

public class LowerTouppervicevers {
    public static String convertCase(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char)(ch - 32);  
            } else if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char)(ch + 32); 
            } else {
                result[i] = ch;  
            }
        }

        return new String(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String convertedString = convertCase(input);
        System.out.println("Converted string: " + convertedString);

        scanner.close();
    }
    
}
