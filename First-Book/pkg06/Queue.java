package pkg06;

public interface Queue<E> {
    /** Inserts an element at the rear of the queue */
    void enqueue(E e);
    /** Removes an element at the front of the queue */
    E dequeue();
    /** Returns an element at the front of the queue, but not remove */
    E first();
    /** Returns the number of elements in the queue*/
    int size();
    /** Tests whether the queue is empty */
    boolean isEmpty();



    
    
}
