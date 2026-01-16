public class LinkedPositionalList<E> implements PositionalList<E> {
    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E e, Node<E> p, Node<E> n){
            element = e ;
            prev = p;
            next = n;
        }
        public E getElement() throws IllegalStateException{
            if(next==null)
                throw new IllegalStateException("Position no longer valid");
            return element;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setElement(E e){
            element = e;
        }
        public void setPrev(Node<E> p){
            prev = p;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    } // ------------end of nested Node class-----------

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    
    public LinkedPositionalList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.setNext(trailer);
    }
}
