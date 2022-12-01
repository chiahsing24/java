package collections.treeset;

import java.util.*;

public class Demo01 {
    /**
     *  TreeSet: Creation and Insertion
     */
    public static void main(String[] args) {
        // Creating a TreeSet
        // Using the no-arg constructor
        Set<Integer> set1 = new TreeSet<>();

        // Using a constructor with a Collection type argument
        List<Integer> list1 = new LinkedList<>();
        list1.add(21);
        list1.add(32);
        list1.add(44);
        list1.add(11);
        list1.add(54);

        TreeSet<Integer> set2 = new TreeSet<>(list1);
        System.out.println("TreeSet elements in ascending order " + set2);

        // Inserting an element into a TreeSet
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(21);
        set3.add(32);
        set3.add(44);
        set3.add(11);
        set3.add(54);
        System.out.println("TreeSet elements in ascending order " + set3);

        // This TreeSet will store the elements in reverse order.
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(21);
        reverseSet.add(32);
        reverseSet.add(44);
        reverseSet.add(11);
        reverseSet.add(54);
        System.out.println("TreeSet elements in descending order " + reverseSet);
    }
}
