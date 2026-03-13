package Stacks;
import java.util.Stack;

public class PolishNotationEvaluate{

    /**
     * Method to Postfix notation evaluation, algorithm is for digits 0-9
     */
    public static int evaluation(String s){

        Stack<Integer> stack = new Stack();
        // idea is to push untill operator is reached then pop do calculation and push again
        for(char c: s.toCharArray()){
            if(c == ' ') continue;
            // push until + - / *
            if(c != '+' && c != '-' && c != '/' && c != '*' ){
                stack.push(c -'0');
            } else if (c == '+'){
                int x = stack.pop();
                int y = stack.pop();
                int z = y+x;
                stack.push(z);
            } else if(c == '*'){
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x*y);
            } else if(c == '/'){
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x/y);
            } else if(c == '-'){
                int y = stack.pop();
                int x = stack.pop();
                stack.push(x-y);
            }

        }

        return stack.pop();

    }

    public static void main(String[] args) {
        String s = "5 1 2 + 4 * + 3 -";
        int a = evaluation(s);
        System.out.println(a);

    }
}