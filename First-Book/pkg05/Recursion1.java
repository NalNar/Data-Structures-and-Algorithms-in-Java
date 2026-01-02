package pkg05;

public class Recursion1 {

    public static int factorial(int n) throws IllegalArgumentException{
        long curr = System.nanoTime();
        if(n<0){
            throw new IllegalArgumentException();
        }
        else if(n==0){
            return 1;// base case
            
        } 
        else{
            long end = System.nanoTime();
            System.out.println(end-curr);
            return n*factorial(n-1); // recursive
        }
    }
    

    public static void main(String[]args){
        System.out.println(factorial(10));
    }
    

}