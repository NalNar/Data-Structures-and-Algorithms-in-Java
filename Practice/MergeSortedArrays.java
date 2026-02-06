import java.util.Arrays;

public class MergeSortedArrays {
    
    public static int[] mergeSortedArray(int [] a, int[] b, int z, int y){

        // if my current value in a is less than b in the same index insert 
    
        int[] nums = new int[z+y];

        for(int i = 0; i<z; i++){
            nums[i] = a[i];
        }

        int counter = 0;
        for(int i = z; i<nums.length; i++ ){
            nums[i] = b[counter++];
        }

        Arrays.sort(nums);
    
        return nums;
    
    
    
    }
    
    
    public static void main(String[]args){
        int x = 3;
        int y = 2;
        int a[] = {1,2, 10 };
        int b[] = {3,4};

        System.out.println(Arrays.toString(mergeSortedArray(a, b, x, y)));
    }
}
