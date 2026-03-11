
/**
 *  Exercise 6: Simple Recursion
 * Write a recursive method that computes the sum of the digits in an integer. Use the following method header:
 * public s t a t i c int sumO fDigits (long n )
 * For example, sumOfDigits( 234 ) should return 9 (since 2 + 3 + 4 = 9 ) and sumOfDigits( 390 ) should return 12 (since 3 + 9 + 0 = 12 )
 */

public class SimpleSum {
    public static int sumOfDigits(long n){

        // base case when the digits is <0
        if (n ==0){
            return 0;
        }

        // // if the n < 10 it already is one digit
        // if(n < 10){
        //     return (int) n;
        // }
        
        // pick the last digit and sum again
                
        return (int) n%10 + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int a = sumOfDigits(390);
        System.out.println(a);
    }
    
}
