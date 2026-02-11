package LinkedList;

public class SimpleLinkedList<E> {

    private static class SimpleNode <E> {
        SimpleNode<E> next;
        E data;

        /** 
         * construct new node with the data and new reference
         * @param E data, SimpleNode<E> next
         * @param data the data element to be stored in the node.
         * @param next the reference to the next node in the list.
         */
        public SimpleNode(E data, SimpleNode<E> next){
            this.next = next;
            this.data = data;
        }
    }


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
    public void add(E data){

    }
}
