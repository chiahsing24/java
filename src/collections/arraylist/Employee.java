package collections.arraylist;

public class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee emp) {
        // Sort the employee based on age in ascending order.
        return this.age - emp.age;
    }
}
