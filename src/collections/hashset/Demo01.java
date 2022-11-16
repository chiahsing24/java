package collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class Demo01 {
    /**
     *  HashSet: Creation and Insertion
     */
    public static void main(String[] args) {
        // Create a HashSet using the no-arg constructor
        Set<Integer> set1 = new HashSet<>();

        System.out.println("Inserting 23 in the HashSet:  " + set1.add(23));
        System.out.println("Inserting 34 in the HashSet:  " + set1.add(34));
        System.out.println("Inserting 23 in the HashSet:  " + set1.add(23));
        System.out.println(set1);

        // Fetching an element from a HashSet
        System.out.println(set1.contains(23));
    }
}
