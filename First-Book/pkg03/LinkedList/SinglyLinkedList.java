package pkg03.LinkedList;

public class SinglyLinkedList<E extends Comparable<E>>{

    private static class Node<E>{
        private E element;
        private Node<E> next;

        public Node(E data, Node<E> next){
            element = data;
            next = next;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {}

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E first(){
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e){
        head = new Node<>(e, head);
        if (size == 0) tail = head;
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()){
            head = newest;
            tail = newest;
        } else {
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public E removeFirst(){
        if (isEmpty()) return null;

        E answer = head.getElement();
        head = head.getNext();
        size--;

        if (size == 0) tail = null;
        return answer;
    }

    /** 
     * Generic ordered insertion assuming the linked list is already in sorted order
     */
    public void orderedInsertion(E item){
        Node<E> newNode = new Node<>(item, null);
        // Case 1: if the head is smaller than item
        if(head == null || item.compareTo(head.element) < 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: inserting at the middle of the linked list
        Node<E> current = head;
        while(current.next != null && current.next.element.compareTo(item) < 0){
            current = current.next;
            
        }
        // Case 3: inserting at the tail, also works for middle as per latest implementation
        newNode.next = current.next;
        current.next = newNode;
    }
}
