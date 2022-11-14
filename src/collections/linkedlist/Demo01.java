package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo01 {
    /**
     *  LinkedList: Introduction
     */
    public static void main(String[] args) {
        // Using the no-arg constructor
        List<Integer> list1 = new LinkedList<>();

        // Using existing Collection
        List<Integer> list2 = new LinkedList<>(list1);

        // Inserting a single element at the end add(E e), or addLast(E e)

        // Inserting an element at a particular index add(int index, E element)

        // Inserting multiple elements from another Collection addAll(Collection c)

        // Inserting multiple elements from another Collection at a particular index addAll(int index, Collection c)

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        System.out.println(linkedList);

        linkedList.addFirst(10);
        System.out.println(linkedList);

        linkedList.add(2, 20);
        System.out.println(linkedList);

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);

        linkedList.addAll(3, arraylist);
        System.out.println(linkedList);
    }
}
