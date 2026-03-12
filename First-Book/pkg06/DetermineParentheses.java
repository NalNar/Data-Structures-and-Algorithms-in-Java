package pkg06;

public class DetermineParentheses {

    public static boolean valid(String string){
        ArrayStack<Character> stack = new ArrayStack<Character>();

        // push the character untill there is a closing
        // if the closing character then pop 
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == '[' 
            || string.charAt(i) == '{'
            || string.charAt(i) == '('){
                stack.push(string.charAt(i));
            }
            // matching the closing and opening characters
            else if (string.charAt(i) == ']' && stack.top() == '[' 
            || string.charAt(i) == '}' && stack.top() == '{' 
            || string.charAt(i) == ')' && stack.top() == '(')
            {
                //if the stack is empty return false
                if (stack.isEmpty()){return false;}
                stack.pop();
            }
            else {
                return false;
            }

        }

        return stack.isEmpty();

    }
    public static void main (String[]args){
        String s = "{[]}";
        System.out.println(valid(s));

    }
    
}
