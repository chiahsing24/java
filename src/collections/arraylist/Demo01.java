package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        // Using no-rg constructor
        List list1 = new ArrayList();

        // Using the constructor that takes initial capacity
        List list2 = new ArrayList(50);

        // Using existing collection
        List oldList = Arrays.asList(1, 2, 3, 4, 5);
        List list3 = new ArrayList(oldList);
    }
}
