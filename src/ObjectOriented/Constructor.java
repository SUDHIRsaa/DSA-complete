package ObjectOriented;

public class Constructor {
    // Default Constructor
        Constructor(){
            System.out.println("hello");
        }

    // data members of the class.
        String name;
        int id;
    // Parametrized Constructor
        Constructor next;
        Constructor(String name, int id) {
            this.name = name;
            this.id = id;
            System.out.println(
            "Constructor with two arguments : "
            + " String and Integer : " + name + " " + id);
    
        }
    // Ovveriden COnstructor (just for knowledge)
        Constructor(String name) {
            System.out.println("Constructor with one "
            + "argument - String : " + name);

            
        }
    // Copy Constructor
        Constructor(Constructor copy){
            this.name=copy.name;
            this.id=copy.id;
            
        }
        

    public static void main(String[] args) {

        Constructor defualt=new Constructor();



        Constructor parameter=new Constructor("sudhir",10);
        System.out.println(parameter.id);
        System.out.println(parameter.name);



        Constructor overloading =new Constructor("Sudhir");


        Constructor copy = new Constructor(parameter);
         System.out.println(copy.name);
         System.out.println(copy.id);
    }
    
}


