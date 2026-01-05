public class Recursion4 {
 // recursion method for computing out the value of x raised to the nth power, for int>0
    public static double power(double x,int power){
        if(power==0){
            return 1;
        } else{
            return x*power(x,power-1);
        }
    }
    public static void main(String[] args) {
        double x = power(10, 5);
        System.out.println(x);
    }   
}
