package pkg06;

import java.util.ArrayDeque;
import java.util.Deque;

/** 
 * Array Stack Implementing the Stack ADT
 */
public class ArrayStack <E> implements Stack<E>{
    // The ArrayStack has intial Capacity of 1000;
    public static int Capacity = 1000;
    private E[] data; // array used for storage
    private int t = -1; // index of the top element in stack


    /**
     * Constructor - no args 
     */

    public ArrayStack(){
        this(Capacity);
    }

    /**
     * Constructor with the input capacity
     * @param capacity
     */

    public ArrayStack(int capacity){
        this.data = (E[]) new Object[capacity];
    }

    /** 
     * Returns the size, the total elements in the stack
     * @return int
     */
    public int size(){
        return t+1;
    }

    /** 
     * return whether stack is empty
     * @return boolean
     */
    public boolean isEmpty(){
        return t == -1;
    }

    /** 
     * Inserts the element at top of the stack1
     * @param E intput
     */

    public void push(E e) throws IllegalStateException{
        // if the size is same as the length of the array 
        if(size()==data.length)
            throw new IllegalStateException("Stack is full");
        data[++t] =e;
    }


    public E top(){
        if(isEmpty()) 
            return null;
        return data[t];
    }

    public E pop(){
        if(isEmpty())
            return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }

    /** 
     * Method to copy Stack A to Stack B, since using the
     * array implementation the capacity is limited to 1000 elements
     * @param input stack make a copy
     * @return copied Stack
     */
    public Stack<E> copyStack(Stack<E> stackOne){
        // using two stack to copy stackone
        ArrayStack<E> stackTemp = new ArrayStack<>();
        ArrayStack<E> stackToOut= new ArrayStack<>();

        // idea is fist to transfer all the stack1 to temp to stackout
        
        while(!stackOne.isEmpty()){
            stackTemp.push(stackOne.pop());
        }

        // now stack temp would be 
        // for eg abc -> cba
        while(!stackTemp.isEmpty()){
            // to restore and revive the element
            E element = stackTemp.pop();
            stackToOut.push(element);
            stackOne.push(element);
        }

        return stackToOut;

    }
    /**
     * Max Stack gives the maxium
     */

}
