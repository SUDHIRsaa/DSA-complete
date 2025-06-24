package Interview;
import java.util.*;

public class Questionone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if (a.isEmpty()) {
            System.out.println("String is Empty");
        } else {
            int[] count = new int[256]; // Array to store the frequency of each character
            
            // Count the frequency of each character
            for (int i = 0; i < a.length(); i++) {
                char currentChar = a.charAt(i);
                count[currentChar]++;
            }

            // Print duplicates and their count
            boolean[] printed = new boolean[256]; // To ensure each duplicate is printed only once
            for (int i = 0; i < a.length(); i++) {
                char currentChar = a.charAt(i);

                // Check if this character is a duplicate and hasn't been printed yet
                if (count[currentChar] > 1 && !printed[currentChar]) {
                    System.out.println("Duplicate: " + currentChar + " Count: " + count[currentChar]);
                    printed[currentChar] = true; // Mark this character as printed
                }
            }
        }
    }
}
