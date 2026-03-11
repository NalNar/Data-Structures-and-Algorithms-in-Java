package Recursion;

public class OccuranceString {
    
    public static int occuranceString(String s, char target){
        // base case when the string length is 0
        if(s.length() == 0){
            return 0;
        }   
        // if the char at the 0 
        if(s.charAt(0) == target){
            return 1 + occuranceString(s.substring(1,s.length()), target);
        } else {
            return occuranceString(s.substring(1,s.length()), target);
        }
    }

    public static void main(String[]args){
        int a = occuranceString("helloooollll", 'l');
        System.out.println(a);
    }
}
