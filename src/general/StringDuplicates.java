package general;

public class StringDuplicates {
    public static void main(String[] args) {
        String a = "AAZZaabbccddd";
        int[] count = new int[256]; 
        

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
        }

 
        System.out.println("Duplicate characters and their counts:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " -> " + count[i]);
            }
        }
    }
}
