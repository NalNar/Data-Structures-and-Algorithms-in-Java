/* Program to return sum of the all the + />0/ integers upto input n  */
public class sumN {

    public static int sumN(int n){
        int output = 0;
        int counter = 0;
        // to sum until n 
        do{
            output += counter++;
            n--;
        } while (n>=0); 

        return output;
        
    }
    
    public static void main(String[] args) {
        System.out.println(sumN(3));
    }
    
}
