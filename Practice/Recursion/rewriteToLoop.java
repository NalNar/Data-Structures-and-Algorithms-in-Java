package Recursion;

public class rewriteToLoop {
    /* Rewrite this to interative
     *  public int recur( int n ) {
        if (n < 0 ) throw new IllegalArgumentException ("negative argument detected");
        return recur_proper(n);
        }
        public int recur_proper ( int n ) {
        if (n < 0 )
        return -1;
        else if ( n < 10 )
        return 1;
        else
        return ( 1 + recur_proper ( n / 10 ) );
    } 
     */
    public static void main(String[] args) {
       /* Counts the number of digits in postive integer */
        int n = 7;
        int counter = 0;
        // when smaller int truncates decimal points
        while(n>0 && n!=0){
            counter++;
            n = n/10; 
        }
        System.out.println(counter);
    }
}
