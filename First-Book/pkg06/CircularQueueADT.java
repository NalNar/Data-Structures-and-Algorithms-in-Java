package pkg06;

public interface CircularQueueADT<E> extends Queue<E>{
    /**
     * Added feature of rotating the element of the queue to the back of the queue
     * this does nothing if the queue is empty
     */
    void rotate();
}