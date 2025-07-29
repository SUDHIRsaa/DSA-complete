import java.util.HashMap;
public class Hello {
    public static void main(String[] args) {
        HashMap<Integer,Character> map=new HashMap<>();
        for(int i=1;i<=26;i++){
            map.put(i, (char) (96 + i));
        }
        for(int value:map.keySet()){
            System.out.println(value + " : " + map.get(value));
        }
        System.out.println(map.get(4));
    }
}