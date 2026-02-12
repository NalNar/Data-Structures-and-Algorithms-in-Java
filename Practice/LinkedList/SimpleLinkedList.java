package LinkedList;

public class SimpleLinkedList<E> {

    private static class SimpleNode <E> {
        SimpleNode<E> next;
        E data;

        /** 
         * construct new node with the data and new reference
         * @param E data, SimpleNode<E> next
         * @param data the data element to be stored in the node.
         * @param next the reference to the next node in the list.
         */
        public SimpleNode(E data, SimpleNode<E> next){
            this.next = next;
            this.data = data;
        }
    }  
    // ends


    private SimpleNode<E> head;
    private SimpleNode<E> tail;
    private int totalSize;

    /** Constructing an empty linked list
     * Initializes the head and tail references to null and the size to zero.
     */

    public SimpleLinkedList(){
        head = null;
        tail = null;
        totalSize = 0;

    }
    public void add(E data){
        if(head == null){

        }

        SimpleNode<E> addNew = new SimpleNode<E>(data, head);
        head = addNew;

        if(tail == null){
            tail = addNew;
        }

        totalSize++;


    }


    // the add method with var args
    public void add(E...data){
        if(head == null){

        }

        for(E e : data){
        SimpleNode<E> addNew = new SimpleNode<E>(e, head);
        head = addNew;

        if(tail == null){
            tail = addNew;
        }

        totalSize++;


        }
    }
    // public E getNum(){

    // }

    public String toString(){


        /// the entry to this linked list implementation is the head
        /// so entry must from head to the tail, or until the head is not null
        /// 
        if(head == null){
            return "{}";
        }

        // referencing the head to move traverse through the list
        SimpleNode<E> current = head;
        StringBuilder outputString = new StringBuilder();

        outputString.append("{");

        while(current != null){
            outputString.append(current.data);


            // if there exist next reference, ie not null then add ',' 
            if(current.next!=null) 
                outputString.append(',');
        
            current = current.next;
        }
        outputString.append("}");


        return outputString.toString();
        }



    public static void main(String[] args) {
        SimpleLinkedList<String> l1 = new SimpleLinkedList<>();
        l1.add("www","22","22");
        System.out.println(l1.toString());
    }
}


