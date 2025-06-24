package ObjectOriented;

import java.util.Scanner;

public class Basics2 {
    public static void main(String[] args) {
        inputs();
        
    }
    public static void inputs() {
        Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
   
   int  age=sc.nextInt();
    sc.nextLine();
    String gender=sc.nextLine();
    sc.close();
    print(age, name, gender);

    }
    public static void print(int age,String name,String gender){
        System.out.println("Age "+ age+" name "+name +"  gender  "+gender);
    }

    
}
