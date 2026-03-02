package Other;
import java.util.*;

public class ParenthesesMatching {
    public static boolean bracketMatching(String input){
        Stack<Character> s = new Stack<>();
        
        for(int i =0; i<input.length(); i++){
            if(input.charAt(i) == '('){
                s.push('(');
            }
            if(input.charAt(i) == ')'){
                if (s.isEmpty()){
                    return false;
                }
                s.pop();
            }
            
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "4x((2-1()";
        System.out.println(bracketMatching(s));
    }
    
}
