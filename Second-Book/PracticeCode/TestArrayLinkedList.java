import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections; 

public class TestArrayLinkedList{

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();

        for (int i = 0; i<=10;){
            arraylist.add(i++);
        }
        
        System.out.println(" The List of the array list elements: " + arraylist);

        LinkedList<Object> linkedlist = new LinkedList<>();
        for(int i = 10; i>=0;){
            linkedlist.add(i--);
        }

        System.out.println(" The List of the linked list elements: " + linkedlist);


        ListIterator<Object> listIterator = linkedlist.listIterator(linkedlist.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();

        arraylist.add(11,0);
        Collections.sort(arraylist);
        linkedlist.add(0);
                System.out.println(" The List of the array list elements: " + arraylist);

        System.out.println(Collections.binarySearch(arraylist,0));





    }




}