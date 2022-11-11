package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo08 {
    /**
     *
     *  Understanding Comparator Interface
     */
    public static void main(String[] args) {
        List<Vehicle> list1 = new ArrayList<>();
        list1.add(new Vehicle("Volkswagen", 2010));
        list1.add(new Vehicle("Audi", 2009));
        list1.add(new Vehicle("Ford", 2001));
        list1.add(new Vehicle("BMW", 2015));

        // Using dedicated comparator class
        System.out.println("Sorting by brand name.");
        Collections.sort(list1, new BrandComparator());
        for (Vehicle vehicle : list1) {
            System.out.println("Vehicle brand: " + vehicle.brand + ", Vehicle make: " + vehicle.makeYear);
        }

        System.out.println();
        System.out.println("Sorting by make year.");
        Collections.sort(list1, new MakeYearComparator());
        for (Vehicle vehicle : list1) {
            System.out.println("Vehicle brand: " + vehicle.brand + ", Vehicle make: " + vehicle.makeYear);
        }

        // Using anonymous comparator class
        System.out.println();
        System.out.println("Sorting by brand using anonymous class.");
        Collections.sort(list1, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.brand.compareTo(o2.brand);
            }
        });
        for (Vehicle vehicle : list1) {
            System.out.println("Vehicle brand: " + vehicle.brand + ", Vehicle make: " + vehicle.makeYear);
        }

        // Using lambda expression comparator class
        System.out.println();
        System.out.println("Sorting by brand using lambda expression.");
        Collections.sort(list1, (o1, o2) -> {
            return o1.brand.compareTo(o2.brand);
        });
        for (Vehicle vehicle : list1) {
            System.out.println("Vehicle brand: " + vehicle.brand + ", Vehicle make: " + vehicle.makeYear);
        }

    }
}
