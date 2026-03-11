package Recursion;

public class Series_3 {
    
    public static double series3(int i){
        if(i == 1)
            return 1.0/2;

        return (double) i/(i+1.0) + series3(i-1);
    }


    public static void main(String[]args){
        double a = series3(2);
        System.out.println(a);

    }
}
