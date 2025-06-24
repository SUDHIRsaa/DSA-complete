
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
 
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(1, 2));
        input.add(Arrays.asList(3, 4));
        input.add(Arrays.asList(5, 6));
        
        

        List<List<Integer>> output = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (i % 2 == 0) {
                temp1.addAll(input.get(i));
            } else {
                temp2.addAll(input.get(i));
            }
        }

        output.add(temp1);
        output.add(temp2);
        for (List<Integer> innerList : output) {
            System.out.println(innerList);
        }
    }
}
