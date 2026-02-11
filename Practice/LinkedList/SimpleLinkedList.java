package LinkedList;

public class SimpleLinkedList<E> {
    private SimpleNode<E> head;
    private SimpleNode<E> tail;
    private int totalSize;

    /** Constructing an empty linked list
     * Initializes the head and tail references to null and the size to zero.
     */

    public SimpleLinkedList(){
        head = null;
        tail = null;
        totalSize = 0;

    }
    
}
