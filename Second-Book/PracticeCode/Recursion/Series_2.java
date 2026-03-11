package Recursion;

public class Series_2 {

    static double series2(int i){
        // base case when i == 1
        if(i == 1 ){
            return 1.0/3;
        }
        return (double) i / (2.0*i + 1) + series2(i-1);
    }

    public static void main (String[]args){
        double t = series2(2);
        System.out.println(t);
    }
    
}
