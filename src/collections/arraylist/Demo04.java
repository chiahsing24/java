package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo04 {
    /**
     *  ArrayList: Iteration
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(10);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (Integer i : list1) {
            System.out.println(i);
        }

        // Using Iterator
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Remove element using iterator
        itr = list1.iterator();
        while (itr.hasNext()) {
            int next = itr.next();

            if (next == 30) {
                itr.remove();
            }
        }

        System.out.println(list1);
    }
}
