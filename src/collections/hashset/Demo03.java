package collections.hashset;

import java.util.*;

public class Demo03 {
    /**
     *  HashSet: Iteration and Sorting
     */
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(23);
        set1.add(34);
        set1.add(56);

        // Using for loop
        for (int i : set1) {
            System.out.println(i);
        }

        // Using Iterator
        Iterator<Integer> itr = set1.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using forEach()
        set1.forEach(System.out::println);

        // Sorting a HashSet
        List<Integer> list = new ArrayList<>(set1);
        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
