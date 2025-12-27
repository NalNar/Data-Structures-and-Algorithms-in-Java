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

    public boolean isEmpty(){return size==0? true:false;} // use ternary betters for visual, just size==0 would be same

    //returns the first elem
    public E first(){
        if(isEmpty()){
            return null;
        } else {
        return head.getElement();
        }
    }
        public E last(){
        if(isEmpty()){
            return null;
        } else {
        return tail.getElement();
        }
    }

    // setters method

    public void addFirst(E e){
        // creating the "new head" by linking the old head to the new element
        head = new Node<>(e,head);
        if(size==0){
            tail = head;
        }
        size++;
    }

    public void addLast( E e ){
        // ADDING. at the tail of the list, since it is tail it would point to null
        Node<E> newest = new Node<>(e,null);
        if(isEmpty()){
            head = newest; 
        } else 
        {
            tail.setNext(newest);
            tail = newest;
            size++;
        }
    }
    // remove the first and return 
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
            E answer = head.getElement();
            head = head.getNext();
            size--;
 

            return answer;
        }


}

