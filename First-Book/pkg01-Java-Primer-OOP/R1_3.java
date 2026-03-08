public class R1_3{

    /*  */
    protected static boolean isMultiple(long n, long m){

        if (m == 0){return false;}
        // if they both are muliple, then there shouldnt be any remainder
        return (n%m == 0);
    }

    public static void main(String[] args) {
        long a = 10;
        long b = 5;
        System.out.println(isMultiple(a,b));
        
    }
}