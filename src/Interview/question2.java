package Interview;
import java.util.*;
public class question2 {

    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            String input= sc.nextLine();
            StringBuilder encoded = new StringBuilder();
            int count = 1;
            
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1)) {
                    count++;
                } else {
                    encoded.append(input.charAt(i - 1)).append(count);
                    count = 1;
                }
            }
            encoded.append(input.charAt(input.length() - 1)).append(count);
            System.out.println(encoded);
    }
}