/* Program to return sum of square of the all the + />0/ integers upto input n  */
public class r1_7 {

    public static int squareN(int n){
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum += i*i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squareN(3));
    }

}
