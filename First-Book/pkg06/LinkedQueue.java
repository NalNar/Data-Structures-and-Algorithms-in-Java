package pkg06;
/** Linked list representation of the Queue ADT */

import pkg03.LinkedList.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>(); // an empty list
    
    /**
     *  Constructor 
     */
    public LinkedQueue(){
        // new queue relies on the intially empty list
    }

    /** 
     * Returns the number of elements in the Queue
     * @return size
     */

    public int size(){
        return list.size();
    }

    /** 
     * Determine whether the list is empty or not
     * @return boolean 
     */

    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * Inserts the element in the queue
     * @param E element
     */
    public void enqueue(E element){
        // enqueuing happens at the tail of the list at the end of the list
        // O(1) operation, if at the adding at the tail would be O(N) since they need to update the tail
        list.addLast(element);
    }

    /**
     * Removes the element from the "front" of the queue
     * @return E element
     */
    public E dequeue(){
        return list.removeFirst();
    }

    /**
     * Returns but does not removes the element from the front of the queue
     * @return E element
     */
    public E first(){
        return list.first();
    }
    
}
