package general;

public class SortString {
    public static void main(String[] args) {
        String s = "efabcABVrhowiufgibvsdfoigfufjvjvbi9fuepgihsdIDZYFDIUCD";
        int[] frequency = new int[128];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)]++;
        }
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                sortedString.append((char) i);
                frequency[i]--;
            }
        }

        
        System.out.println("Sorted String: " + sortedString.toString());
    }
}
