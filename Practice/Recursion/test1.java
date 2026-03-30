public class test1{

    public static int sum(int[] arr, int i){
        return sumI(arr, 0);
    }
    public static int sumI(int[] arr, int i){
        // choice
        // return sum from index i -> end
        if(arr.length-1==i){
            // at end of it
            return arr[arr.length-1]; // 0 based indexing
        }
        int sum = arr[i];
        sum = sum+sumI(arr,i+1);

        return sum;
    }

    public static void main(String[] args) {
        int[]ar={8,8,9};
        System.out.println(isSorted(ar, 0));
        // // System.out.println(sum(ar, 0));
        // int a = countZeros(102030);
        // System.out.println(a);
    }
    public static boolean isSorted(int[] arr, int i){
        // to mean to be sorted?
        // arr[i] <= arr[i+1]
        // problem i+1 outofbounds
          if(arr.length-1<=i){
            return true; // valid since went all the way
        }
          if(arr[i] > arr[i+1]){
            return false; // break no more calls
        }

        return isSorted(arr, i+1);



    }
    public static boolean canSum(int[] arr, int target, int i){
        // if target is 0 we're golden
        if(target==0)
            return true;
        if(arr.length<=i)
            return false;

        int temp = arr[i];
        if(canSum(arr, target-temp, i+1))
            return true;

        // if target temp doesnt wirk for this a[i]
        if(canSum(arr, target, i+1))
            return true;
        
        return false; // hail mry notging works
    }
    public static int countWays(int n){
        /*
        if 5  - 2+3
        contraint 1 or 2 steps
         */
        return countWay(n, 0);

    }

    public static int countWay(int n, int s){
        if(n==n){
            return 0;
        }

    }
    public static void reverse(int[] arr, int i, int j){
        // arr[0] = arr[l-1]
        // tmp = arr[0];
        // arr[l-1] = tmp;
        if(i>=j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i+1, j-1);

    }

    public static int countZeros(int n){
        //102030 => 3
        //break the n if 0 then + 1 recurse else recuwithout it

        if(n<=0)
            return 0;
        if(n%10 == 0)
            return 1+countZeros(n/10); // move decimal

        return countZeros(n/10);
    }

}