package general;

public class Lexographical {
    public static void main(String[] args) {
        
        String ans[]={"ans","bns","cns","dns","ens","fns","gns"};
        for (int i = 0; i < ans.length; i++) {

            if(ans[i].compareTo(ans[i+1]) > 0){
                System.out.println();
            }
        }
    }
    
}
