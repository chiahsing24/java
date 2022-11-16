package collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Demo02 {
    /**
     *  LinkedList: Fetching and Removing
     */
    public static void main(String[] args) {
        // Fetching the first element getFirst()

        // Fetching the last element getLast()

        // Fetching an element at a particular index get(int index)

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

        // Removing the first element removeFirst()

        // Removing the last element removeLast()

        // Removing an element at a particular index remove(int index)

        // Removing a particular element remove(Object o)

        System.out.println("LinkedList before removing any element " + linkedList);

        linkedList.remove(); //Removes the first element.
        System.out.println("LinkedList after removing first element " + linkedList);

        linkedList.removeLast(); //Removes the last element.
        System.out.println("LinkedList after removing last element " + linkedList);

        linkedList.remove(new Integer(2)); //Removes the first occurrence of 2.
        System.out.println("LinkedList after removing first occurrence of 2. " + linkedList);

        linkedList.removeLastOccurrence(new Integer(4)); //Removes the last occurrence of 4.
        System.out.println("LinkedList after removing the last occurrence of 4. " + linkedList);

        // Sorting a LinkedList
        LinkedList<Integer> sortedLinkedList = new LinkedList<>();
        sortedLinkedList.add(20);
        sortedLinkedList.add(2);
        sortedLinkedList.add(12);
        sortedLinkedList.add(40);
        sortedLinkedList.add(76);
        sortedLinkedList.add(41);
        sortedLinkedList.add(53);

        Collections.sort(sortedLinkedList);
        System.out.println(sortedLinkedList);
    }
}
