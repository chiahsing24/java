package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo07 {
    /**
     *  Understanding Comparable Interface
     */
    public static void main(String[] args) {
        // How to sort custom object using Collections.sort(List<T> list) ?
        // The custom class must implement the Comparable interface.
        // (ex) Employee
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", 29));
        employeeList.add(new Employee("Alex", 54));
        employeeList.add(new Employee("Matt", 19));
        employeeList.add(new Employee("Roy", 72));

        Collections.sort(employeeList);
        for (Employee employee : employeeList) {
            System.out.println("Employee name: " + employee.name + ", Employee age: " + employee.age);
        }

        // (ex) Vehicle
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Volkswagen", 2010));
        vehicleList.add(new Vehicle("Audi", 2009));
        vehicleList.add(new Vehicle("Ford", 2001));
        vehicleList.add(new Vehicle("BMW", 2015));

        Collections.sort(vehicleList);
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Vehicle brand: " + vehicle.brand + ", Vehicle make year: " + vehicle.makeYear);
        }
    }
}
