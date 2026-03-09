/*  Short program for checking even integer with bitwise */

public class R1_4{
    public static boolean isEven(int i){

        return (i & 1) == 0? true:false;
    }

    public static void main(String[] args) {
        System.out.println(isEven(11));
    }
}