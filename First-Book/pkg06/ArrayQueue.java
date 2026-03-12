package pkg06;
public class ArrayQueue<E> implements Queue<E> {
    // instance variables/data fields
    private E[] data; // generic array used for storage
    private int f = 0; // index of the front elements
    private int sz = 0; // current number of elements
    public static int CAPACITY = 1000;

    
    // constructors
    public ArrayQueue(){
        this(CAPACITY);
    }
    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity]; // safecasting
    }
    
    /** 
     * Returns the number of elements of the queue
     * @return size 
     */
    public int size(){
        return sz;
    }

    /** 
     * Method to test whether the queue is empty or not 
     * @return boolean whether the queue is empty or not
     */
    
    public boolean isEmpty(){
        return (sz==0);
    }

    /**
     * Method to inserts an element at the rear of the queue
     * @param E Element
     */
    public void enqueue(E e) throws IllegalStateException{
        if(sz == data.length){
            throw new IllegalStateException("Queue is full");
        }
        // (f + sz ) % data.length is the index
        data[(f + sz) % data.length] = e;
        
        sz++; // size updated as per the insertions
    }

    /** 
     * Method to remove the front element from the queue
     * @return E element
     */
    public E dequeue(){
        // f is tracking the front
        if(isEmpty())
            return null;

        E output = data[f];
        // since front is removed need to update it
        f = (f + 1) % data.length;
        sz--; // decrement size
        return output;
    }
    /**
     * Return the first element not remove it
     * @return E element
     */
    public E first(){
        if(isEmpty())
            return null;
        // data at front
        return data[f];
    }
    
}

