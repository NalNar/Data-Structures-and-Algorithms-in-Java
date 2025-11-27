package pkg03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArray {
    
    public static void intersectionArray(int[] nums1, int[] nums2){
        var listNums1 = new HashSet<>();
        var listNums2 = new HashSet<>();
        for(int elem: nums1){listNums1.add(elem);}
        for(int elem: nums2){listNums2.add(elem);}

        var output = new ArrayList<>();
        Object[] objectArray = listNums1.toArray();
        System.out.println("Object Array: " + Arrays.toString(objectArray));
        Object[] objectArray2 = listNums2.toArray();
        System.out.println("Object Array: " + Arrays.toString(objectArray2));



    }

    public static void main(String[]args){
        int[] a = {1,2,3,4,5,6};
        int[] b = {2};
        intersectionArray(a,b);
        // System.out.println((c));
    }
    
}
