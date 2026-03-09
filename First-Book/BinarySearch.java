public class BinarySearch {
    /* Returns true if the target value is found at the indicated pos of the arary
        this search only considers the array to be sorted, from data[low] to data[high] inclusive
     */

        public static boolean binarySearch(int[] data, int target, int low, int high){
            // if the interval is empty; no match
            if(low>high){
                return false;
            }
            else{
                int mid = (low+high) / 2;
                if(target == data[mid]){
                    return true; // if the target is at mid we found that element
                }
                else if(target < data[mid]){
                    // if the target in the left side of middle
                    return binarySearch(data, target, low, mid-1); // now high is changed at mid-1
                } else {
                    return binarySearch(data, target, mid+1, high); // if target on the right, make the low is new mid+1                    
                }

            }

        }




        public static void main(String[] args) {
            int a [] = {1,2,3,4,5};
            System.out.println(binarySearch(a, 4, 0, 4));
        }

}
