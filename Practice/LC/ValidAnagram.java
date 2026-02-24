import java.util.HashMap;

public class ValidAnagram{
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        // An anagram is a word or phrase formed by rearranging the letters of 
       //  different word or phrase, using all the original letters exactly once.

        // need hashmap to put all the character for counting (integers)
        // put all the hashmap 
        HashMap<Character, Integer> anagram = new HashMap<>();      
        // create a hashmap for mapping the exact map
         
        for(int i = 0; i<s.length(); i++){
            // get or default, if s.charAt(i) exists add +1 
            anagram.put(s.charAt(i), anagram.getOrDefault(s.charAt(i), 0) + 1);
        }
         
        for(int j = 0; j<t.length(); j++){
            // checking whether is same mapping as s, if char appears more than s, return false
            
            if (!anagram.containsKey(t.charAt(j)) || anagram.get(t.charAt(j)) == 0) {
                return false;
            }
            anagram.put(t.charAt(j), anagram.get(t.charAt(j)) - 1);
        }
      

        return true;
      
    }

    public static void main(String[] args) {
        String s = "hi";
        String t = "ih";
        System.out.println(isAnagram(s,t));
    }
}