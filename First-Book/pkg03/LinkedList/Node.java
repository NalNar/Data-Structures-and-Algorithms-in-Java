package pkg03.LinkedList;

public class Node<E> {
    // reference to the elemenet store at this node
    public E element;
    // referece to subsquent node in the list
    private Node<E> next;

    // constructor
    public Node(E e, Node<E> n){
        element = e;
        next = n;
    }

    public E getElement(){
        return element;
    }

    public Node<E> getNext(){
        return next;
    }
    public void setNext(Node<E> n){
        this.next = n;
    }
}
