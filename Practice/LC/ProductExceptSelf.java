import java.util.*;
public class ProductExceptSelf {
    
    
    public static int[] productExceptSelf(int[] nums) {

        int [] result = new int [nums.length];
        // step 1 
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // step 2
        int rightProduct = 1;
        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i]; 
        }


        return result;

    }
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(a)));
    }

}
