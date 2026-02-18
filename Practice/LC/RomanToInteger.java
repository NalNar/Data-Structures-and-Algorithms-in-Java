import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> roman = new HashMap<>(); 

        /*         Symbol       Value   
                    I             1
                    V             5
                    X             10
                    L             50
                    C             100
                    D             500
                    M             1000
        */

       roman.put('I', 1);
       roman.put('V', 5);
       roman.put('X', 10);
       roman.put('L', 50);
       roman.put('C', 100);
       roman.put('D', 500);
       roman.put('M', 1000);

       int count = 0;
       for(int i = 0; i<s.length(); i++){
        /* I can be placed before V (5) and X (10) to make 4 and 9. 
        X can be placed before L (50) and C (100) to make 40 and 90. 
        C can be placed before D (500) and M (1000) to make 400 and 900.
        */

        int currChar = roman.get(s.charAt(i));

        // checking for out of bounds error
        if(i + 1 < s.length()){
            int next = roman.get(s.charAt(i+1));
            if(currChar < next){
                count -= currChar;
            } else{
            count += currChar;
            }
            
            } else {
                count += currChar;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        // MCMXCIV = 1994

    }

}