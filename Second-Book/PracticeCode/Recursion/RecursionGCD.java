package Recursion;

/** (Compute greatest common divisor using recursion) The gcd(m,n) be defined recursively as follows: 
 * If m % n is 0, gcd(m, n) is n. Otherwise, gcd(m, n) is gcd(n, m % n). 
 * Write a recursive method to find the GCD. 
 * Write a test program that prompts the user to enter two integers and displays their GCD.
 */

public class RecursionGCD {
    public static int gcd(int m, int n){
        // base case when n == 0
        if(n == 0){
            return m;
        }

        if(m%n == 0){
            return n;
        }

        return gcd(n, m%n);


    }
    public static void main(String[] args) {
        // gcd of 10 20
        int a = gcd(10,20);
        System.out.println(a);
        
    }
    
}
