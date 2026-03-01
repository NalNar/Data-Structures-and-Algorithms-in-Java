import java.util.*;

public class GroupAnagrams {
    
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> ans = new HashMap<>();

        // for string s in the input strs, convert to char array
        for(String s: strs){
            char[] chars = s.toCharArray();
            // when sorted strs, we can find the anagrams 
            Arrays.sort(chars);
            String key = new String(chars);
            // if hashmap doesnt contain the string key
            if(!ans.containsKey(key)){
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }
        // return the list

        return new ArrayList<>(ans.values());

    }

    
    public static void main(String[]args){

    }
}
