package collections.arraylist;

import java.util.*;
import java.util.stream.Collectors;

public class Demo06 {
    /**
     *  ArrayList Sorting
     */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(12);
        list1.add(9);
        list1.add(76);
        list1.add(29);
        list1.add(75);

        Collections.sort(list1);
        System.out.println("list1 in asc order: " + list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("list1 in desc order: " + list1);

        list1.set(0, 34);
        list1.set(1, 12);
        list1.set(2, 9);
        list1.set(3, 76);
        list1.set(4, 29);
        list1.set(5, 75);
        System.out.println("list1 reset: " + list1);

        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("list1 in asc order: " + sortedList);

        List<Integer> reverseSortedList = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("list1 in asc order: " + reverseSortedList);

        // Array's sorting
        int[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(arr1);
        System.out.println("arr1 in ascending order: " + Arrays.toString(arr1));

        Integer[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("arr2 in descending order: " + Arrays.toString(arr2));
    }
}
