package Other;
import java.util.*;

public class BracketMatching {

    public static boolean bracketMatching(String input){

        Stack<Character> s = new Stack<>();

        for(int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                    s.push(ch);
                }
            if(ch == ')' || ch == '}' || ch == ']'){
                // check if the stack is empty
                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();

            if(ch == ')' && top != '(') return false;
            if(ch == '}' && top != '{') return false;
            if(ch == ']' && top != '[') return false;



            }
            
        }




        




        return s.isEmpty();
    }




    public static void main(String[] args) {
        
    }
}
