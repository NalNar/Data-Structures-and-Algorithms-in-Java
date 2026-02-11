package LinkedList;

public class SimpleNode <E> {
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
