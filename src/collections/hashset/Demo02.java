package collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class Demo02 {
    /**
     *  HashSet: Operations
     */
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(34);
        set.add(56);

        // Remove an element from a HashSet
        // Using the remove(Object o) method
        /**
         * This method takes an object that needs to be removed as a parameter. If the element is removed, then this
         * method returns true. If the element is not present, then it returns false.
         */
        set.remove(23);
        System.out.println("HashSet after removing one element" + set);

        // Using the clear() method
        /**
         * We can use the clear() method to remove all the elements from a HashSet.
         */
        set.clear();
        System.out.println("HashSet after removing all elements" + set);

        // Checking if the HashSet is empty
        System.out.println(set.isEmpty());
    }
}
