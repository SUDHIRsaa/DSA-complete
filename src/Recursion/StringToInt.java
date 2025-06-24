package Recursion;

public class StringToInt {

        public static int myAtoi(String s) {
            String a=s.trim();
            int ans=Integer.parseInt(a);
            return ans;
            
        }
        public static void main(String[] args) {
            String s="   -68";
           int a= myAtoi(s);
           System.out.println(a);
        }
    }

