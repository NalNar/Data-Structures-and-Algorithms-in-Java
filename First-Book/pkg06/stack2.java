package pkg06;
// implementing a stack using the linked list approach

import pkg03.LinkedList.SinglyLinkedList;

public class stack2<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public stack2(){} // new stack relies on empty list
    public int size(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void push(E element){
        list.addFirst(element);
    }
    public E top(){
        return list.first();
    }
    public E pop(){
        return list.removeFirst();
    }
    
}
