public class CalculatingTime{
    public static void main(String[]args){
        // start time
        long startTime = System.nanoTime();

        int a[];
        for(int i = 0; i<10; i++){
            a = new int[10];
            a[i] = i; 
        }
        

        // ending time
        long endTime = System.nanoTime();

        // elasped time
        long elasped = endTime - startTime;
        System.out.println("Time taken is  "+ elasped + " nano seconds");
    }

}