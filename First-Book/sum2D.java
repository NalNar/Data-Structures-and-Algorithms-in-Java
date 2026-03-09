public class sum2D {
    public static int sumNXN(int[][] n, int i, int j){
        // need i and j
        /* {
        {},{},{}
        }
         */
        
        if (n.length == i){return 0;}
        
        // if j is length
        if(j == n[i].length -1){
            return n[i][j] + sumNXN(n, i+1, 0);
        }


        return n[i][j] + sumNXN(n, i, j+1);
    }
    public static void main(String[] args) {
        int sm = 0;
        int [][] a = { {10, 10}, {20, 10}, {3,1}};
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0 ; j < a[i].length; j++) {
        //         sm += a[i][j];
        //     }   
        // }
        sm = sumNXN(a, 0, 0);
        System.out.println(sm);
    }
    
}
