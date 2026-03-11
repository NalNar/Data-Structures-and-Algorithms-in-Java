package pkg06;
/** Implementing the Stack ADT from the book 6.1.1  
 * @author Nalin Narayan
 * */

public interface Stack<E> {

    /** 
     * Inserts element e to the top of the stack 
     * @param e element
     * 
    */
    void push(E e);

    /**
     * Return and returns the top element from the stack
     * @return the top element
     */

    E pop();

    /**  
     * Return but not remove the top element
     * @return the top element of the stack or null if empty
    */
    E top();

    /** 
     * Return the number of elements in the stack
     * @return the total number of elements in stack
    */
    int size();

    /**
     * test whether the stack is empty 
     * @return boolean whether the stack is empty true or false
     */
    boolean isEmpty();
    
}
