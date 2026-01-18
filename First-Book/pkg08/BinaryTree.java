public class BinaryTree<E> extends Tree<E> {
    //* Returns the position of p's right child */
    Position<E> right (Position<E> p) throws IllegalArgumentException;
    // similarly for left
    Position<E> left (Position<E> p) throws IllegalArgumentException;
    Position<E> sibiling(Position<E> p) throws IllegalArgumentException;
    
}
