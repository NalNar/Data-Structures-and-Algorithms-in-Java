package pkg03.LinkedList;

public class sll01 <E> extends Node {
    // instance var for singly linked list 
    private Node<E> head = null;
    // null = head and tail
    private Node<E> tail = null;

    private int size = 0; // size is 0 when 0 elem
    // empty linked list

    public sll01(){
        super(null, null);
    }
    private int getSize(){return size;}

    public boolean isEmpty(){return size==0? true:false;}

    //returns the first elem
    public E first(){return head.getElement();}
}
