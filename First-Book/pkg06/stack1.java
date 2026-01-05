package pkg06;
// implement a stack using array

public class stack1<E> {

    public static final int CAPACITY = 1000; // array cap
    private E[] data;// generic array for storage
    private int t = -1; // index of the top element in the stack
    // constuct stack with default capacity
    public stack1(){
        this(CAPACITY);
    } 
    // constuct the stack with input capacity
    public stack1(int cap){
        // safe casting 
        data = (E[]) new Object[cap];
    }
    public int size(){
        return (t+1);
    }
    public boolean isEmpty(){
        return t==-1;
    }
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    public E top(){
        if(isEmpty()) return null;
        return data[t];
    }
    public E pop(){
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null; // dereference for garbage collection
        t--;
        return answer;
    }

    


    
}
