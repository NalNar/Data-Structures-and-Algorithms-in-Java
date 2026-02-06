import java.util.Arrays;

public class MedianArrays{

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] nums3 = new int [nums1.length + nums2.length];
            double median = 0.0;
            int counter = 0;
            // length of the nums1+nums2, copy the into nums3
            for(int i = 0; i<nums1.length; i++){
                nums3[i] = nums1[i];
                counter++;
                // goes from 1 to length -1
            }
            
            // if n1.l is 3 then 3 to 7
            int z = 0;
            for(int i = nums1.length; i<nums3.length; i++){
                nums3[i] = nums2[z++];
                counter++;
            }
            Arrays.sort(nums3);
            // finding the median 
            // median is the middle index of the array 
            // if odd then 
            // [1,2,3]
            
            int indexMedian = counter/2;
            // if even then
            if(counter%2==0){
                median = ((double) nums3[indexMedian-1] + nums3[indexMedian])/2; 

            }else{
                // 1 2 3 index = 1
                median = ((double) nums3[indexMedian]); 

            }


            // System.out.println(Arrays.toString(nums3));
            // System.out.println(median);
            return median;
        }

    public static void main(String[] args) {
        int [] a = {1,2,};
        int [] b = {3,4,5};
        findMedianSortedArrays(a, b);
        
    }
}