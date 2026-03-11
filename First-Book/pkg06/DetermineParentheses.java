package pkg06;

public class DetermineParentheses {

    public static boolean valid(String string){
        Stack<Character> stack = new ArrayStack<Character>();

        // push the character untill there is a closing
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == '[' 
            || string.charAt(i) == '{'
            || string.charAt(i) == '('){
            stack.push(string.charAt(i));
            }
            if(string.charAt(i) == ']' 
            || string.charAt(i) == '}'
            || string.charAt(i) == ')'){
            stack.pop();
            }

        }

        if(stack.isEmpty()){
            return 
        }


    }
    public static void main (String[]args){

    }
    
}
