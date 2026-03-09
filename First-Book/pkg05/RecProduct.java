/* to compute the product of two positive integer  */
public class RecProduct {
    public static int recProduct(int a, int b){

        if(b == 0) {return 0;}

        if(b == 1){return a;}
        return a + recProduct(a, b-1);
    }

}
