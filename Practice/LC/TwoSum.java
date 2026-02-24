import java.util.*;
public class TwoSum {

     public static int[] twoSum(int[] nums, int target) {
        // need to map nums the using hash map
        HashMap<Integer, Integer> sum = new HashMap<>();


        for(int i = 0; i<nums.length; i++){
            // finding the complement
            int complement = target - nums[i];
            
            if (sum.containsKey(complement)) {
                return new int[] { sum.get(complement), i };
            }
            
            // Store current number and its index
            sum.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
    


        
        
    }


    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    
}
