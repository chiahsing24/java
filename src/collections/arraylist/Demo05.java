package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo05 {
    /**
     *  ArrayList: Iteration using ListIterator
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        ListIterator<Integer> listIterator = list1.listIterator();

        // Traversing elements
        System.out.println("Forward direction iteration: ");
        while (listIterator.hasNext()) {
            System.out.println("Next element is: " + listIterator.next() + ", and the next index is " + listIterator.nextIndex());
        }

        System.out.println("Backward direction iteration: ");
        while (listIterator.hasPrevious()) {
            System.out.println("Previous element is " + listIterator.previous() + ", and the previous index is " + listIterator.previousIndex());
        }
    }
}
