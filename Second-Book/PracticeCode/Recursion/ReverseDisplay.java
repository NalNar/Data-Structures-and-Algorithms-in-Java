package Recursion;

/** (Print the digits in an integer reversely) Write a recursive method that displays
an int value reversely on the console using the following header:
public static void reverseDisplay(int value)
For example, reverseDisplay(12345) displays 54321. Write a test program
that prompts the user to enter an integer and displays its reversal. */

public class ReverseDisplay {

    public static void reverseDisplay(int value){
        // printing the number before the recusive
        
        // base case
        if (value == 0){return;}

        System.out.println(value%10);
        reverseDisplay(value/10);

    }

    public static void main(String[] args) {
        reverseDisplay(1234);
    }    
}
