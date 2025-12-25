import java.util.*;


public class CountOccurrenceOfWords {
    public static void main(String[] args) {

        // dummy text 
        String text = " One morning, when Gregor Samsa woke from "+
            "troubled dreams, he found himself transformed in his bed"+
             "with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards the viewer. Gregor then turned to look out the window at the dull weather"
             ;


        Map<String, Integer> map = new TreeMap();
        String[] words = text.split("[ \n\t\r.,;:!?(){ ]");

        for(int i = 0; i<words.length; i++){
            String key = words[i].toLowerCase();

            if(key.length()>0){
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                    }
                        else {
                            int value = map.get(key);
                            value++;
                            map.put(key, value);
                }   
            }
        }
    
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for(Map.Entry<String, Integer> entry: entrySet)
            System.out.println(entry.getValue() + "\t" + entry.getKey());
    
    
    
    
    
    
    
    
    
        }    
}
