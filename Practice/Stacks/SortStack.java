package Stacks;

import java.util.Stack;

/** 
 * Program to sort a unsorted stack of integers
 * @author Nalin Narayan
 */
public class SortStack {

    /* Iterative Method */ 
    // start at 411
    public static void sortStackIterative(Stack<Integer> stack){
        Stack<Integer> newStack = new Stack();
        Stack<Integer> temp = new Stack();
        /*
        push into new stack when newStack's peek > pop 
        else pop and push into queueu
        pop unitl index is met when peek>
        */
        newStack.push(stack.pop()); //haderror due to obj and int
        while(stack.isEmpty() != false ){
            Integer a = stack.pop();
            if(newStack.peek() <= stack.pop()){
                newStack.push(a);
            } else if(newStack.peek() > stack.pop() && !newStack.isEmpty()){
                temp.push(a);
            }
        }

        newStack = stack;


    }
    /* Recursive Method */ 
    public static void sortStackRecursive(Stack stack){

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(4);
        stack.add(3);
        stack.add(5);
        stack.add(9);
        stack.add(22);
        stack.add(21);
        stack.add(11);
        stack.add(8);
        sortStackIterative(stack);
        for(int a : stack){
            System.out.println(a);
        }
    }
    
}
