package collections.arraylist;

public class Vehicle implements Comparable<Vehicle> {
    String brand;
    Integer makeYear;

    public Vehicle(String brand, Integer makeYear) {
        super();
        this.brand = brand;
        this.makeYear = makeYear;
    }

    // How to write implementation of the compareTo() method?
    // Then v1.compareTo(v2) should return:
    //      -1 if the production year of v1 is less than the production year of v2.
    //      1 if the production year of v1 is greater than the production year of v2.
    //      0 if the production year of v1 is equal to the production year of v2.

    @Override
    public int compareTo(Vehicle o) {
        return this.makeYear - o.makeYear;
    }

    // If we need to sort the Vehicle class on the basis of the brand name
//    @Override
//    public int compareTo(Vehicle o) {
//        return this.brand.compareTo(o.brand);
//    }
}
