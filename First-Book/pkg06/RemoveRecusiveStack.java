package pkg06;
/** R-6.5 Give a recursive method for removing all the elements from a stack. */
public class RemoveRecusiveStack {

    public static <E> void removeAll(ArrayStack<E> s){
        // base case is when the stack is empty is false,
        // meaning all the elements are gone
        if(s.isEmpty() == false){
            s.pop();
            removeAll(s);
        } else {
            return;
        }

    }
    public static void main(String[]args){
        ArrayStack<Integer> s = new ArrayStack<>();
        s.push(10);
        s.push(10);
        s.push(10);
        removeAll(s);

        System.out.println(s.isEmpty());
    }
    
}
