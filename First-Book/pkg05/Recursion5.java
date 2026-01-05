public class Recursion5 {
    // returns the fibonacci number
    public static long[] fibonacci(int n){
        if (n<=1){
            long[] ans = {n,0};
            return ans;
        } else{
            long[] temp = fibonacci(n-1);
            long[] ans = {temp[0] + temp[1], temp[0]};
            return ans;
        }
    }
}
