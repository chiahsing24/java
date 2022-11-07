package collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    /**
     * ArrayList: Inserting and Retrieving elements
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        // Inserting a single element at the end
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Inserting a single element at a given index
        list.add(1, 5);
        System.out.println(list);

        // Inserting multiple elements from another Collection
        List newList = new ArrayList();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);
        System.out.println(list);

        // Inserting multiple elements from another Collection at a particular index
        list.addAll(5, newList);
        System.out.println(list);
    }
}
