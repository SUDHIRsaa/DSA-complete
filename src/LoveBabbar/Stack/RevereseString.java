package LoveBabbar.Stack;

public class RevereseString {
    public static void main(String[] args) {
        String s="Sudhir";
        stack st =new stack();
        String ans="";
        for(int i=0;i<s.length();i++){
             System.out.println( st.push(s.charAt(i)));
             System.out.println("Element at top is " + st.top());

        }
        for(int i=0;i<s.length();i++){
            ans+=st.pop();
                

        }
       System.out.println(ans);
    }
}
class stack{
    int size=1000;
    Character arr[]=new Character[size];
    int top=-1;
    
    Character push(Character c){
        top++;
        arr[top]=c;
        return c;

    }
    Character pop(){
        Character c=arr[top];
        top--;
        return c;
    }
    Character top() {
        return arr[top];
    }


}