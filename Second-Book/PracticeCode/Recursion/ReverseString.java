package Recursion;

/** (Print the characters in a string reversely) Write a recursive method that dis-
plays a string reversely on the console using the following header:
public static void reverseDisplay(String value) */

public class ReverseString {
    
    public static void reverseDisplay(String value){
        // base case when the value is length 0 
        if(value.length() == 0){
            return;
        }
        // get the last char then recrusive
        System.out.println(value.charAt(value.length()-1));
        reverseDisplay(value.substring(0,value.length()-1));

    }

    public static void main(String[]args){
        reverseDisplay("NULL");
        // System.out.println(s);
    }
}
