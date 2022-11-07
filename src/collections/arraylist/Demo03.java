package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Demo03 {
    /**
     *  ArrayList: Remove and Operations
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(70);
        list1.add(80);
        System.out.println(list1);

        // Removing an element at a particular index
        // remove(int index)
        list1.remove(1); // This will remove the element at index 1 i.e 20.
        System.out.println(list1);

        // Removing a particular element from the ArrayList
        // remove(Object o)
        list1.remove(new Integer(30)); // This will remove 30 from the list.
        System.out.println(list1);

        // Removing all the elements within a given Collection
        // removeAll(Collection<?> c)
        List<Integer> toBeRemovedList = Arrays.asList(40, 50, 60);
        list1.removeAll(toBeRemovedList);
        System.out.println(list1);

        // Removing all the elements from the ArrayList
        // clear()
        list1.clear();
        System.out.println(list1);

        // Replacing all the elements of the ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");

        stringList.replaceAll((element) -> element.toUpperCase());
        System.out.println(stringList);

        // Updating an element in ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(10);
        list2.add(10);
        System.out.println(list2);

        list2.set(4, 50);
        System.out.println(list2);

        if (list2.contains(30)) {
            System.out.println("list2 contains 30");
        }

        System.out.println("Index of first occurence of 10 is " + list2.indexOf(10));
        System.out.println("Index of last occurence of 10 is " + list2.lastIndexOf(10));
    }
}
