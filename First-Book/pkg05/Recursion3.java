public class Recursion3 {
    // implementation of binary search
    public static boolean binarySeach(int [] data, int target, int low, int high) {
        if(low>high)
            return false;
        else{
            int mid = (low+high)/2;
            if(target == data[mid]){
                return true;
            }
            else if (target<data[mid]){
                return binarySeach(data, target, low, mid-1);
        }
            else
                return binarySeach(data, target, mid+1, high);
        
        }
    }

}