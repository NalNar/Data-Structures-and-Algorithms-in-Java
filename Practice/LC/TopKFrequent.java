import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int [] nums, int k){
        // counting the freq
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // min heap based on freq
        PriorityQueue<Integer> heap = new PriorityQueue<>( (a,b) -> freq.get(a) - freq.get(b));

        for(int num: freq.keySet()){
            heap.add(num);
            if(heap.size() > k){
                // removing the smallest frequency
                heap.poll();
            }
        }
        
        // extract result
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }

        return result;

    }
    
}