package LC;

import java.util.Arrays;

public class LC88 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int counter = 0;
    // copying second array nums2 to nums1
        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[counter++]; 
           
        }


        Arrays.sort(nums1);
        String s = Arrays.toString(nums1);
        System.err.println(s);

        return;
    
    
    }
    public static void main(String[]args){
        int x = 3;
        int y = 2;
        int a[] = {1,2,9,0,0};
        int b[] = {4,5};

        merge(a, x, b, y);
    }
}
    

