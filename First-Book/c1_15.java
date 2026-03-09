
import java.util.Arrays;

/* finding the smallest number and largest number in array */
public class c1_15{

    public static int[] minMax(int[] array){
        int [] counter = new int[2];
        int max = array[0];
        int min = array[0];

        // to return array of counter which has min at index 0 , & max at index 1
        for(int i = 1; i < array.length; i++){
            // go from idx 0 to n, if 0 is min, 0 is max then put it at 0 or 1
            if(min < array[i]){
                min = array[i];
            }
            if(max > array[i]){
                max = array[i];
            }
            counter[0] = min;
            counter[1] = max;
        }



        return counter;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,5};
        System.out.println(Arrays.toString(minMax(arr)));
        
    }

}