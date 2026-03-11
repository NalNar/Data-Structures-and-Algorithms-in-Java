package Recursion;

public class Series_1 {
    
    public static double series(int i){
        
        // base case when i - 1, return 1
        if(i == 1){
            return 1.0;
        }
        
        return (1.0/i) + series(i-1);
    }
    
    public static void main(String[]args){
        double a = series(10);
        System.out.println(a);
    }
}
