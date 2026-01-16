public class LinkedPositionalList<E> implements PositionalList<E> {
    private static class Node<E> implements Position<E>{
        private E element;
        private Node<E> prev;
        private Node<E> next;
    }
    
}
