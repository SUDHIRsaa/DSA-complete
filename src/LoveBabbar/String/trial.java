package LoveBabbar.String;


public class trial {
    public static void main(String[] args) {
        int i=0;
        char c='-';
        char p='+';
        String operations[]={"--X","X++","X++"};
        for(int j=0;j<operations.length;j++){
           
          for (int z = 0; z< operations[j].length(); z++) {
                if(operations[j].charAt(z)=='-'){
                    i--;
                    System.out.println(i + "-");
                    break;
                }
                else if(operations[j].charAt(z)=='+'){
                    i++;
                    System.out.println( i + " -");
                    break;

                }
              
          }
              
        }
        System.out.println(i);
    }
    
}
