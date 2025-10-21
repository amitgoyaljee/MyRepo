package PojoMap;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }

    // The toString() method in Java is
    // used to provide a human-readable string representation of an object.
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class PojoMapExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee(1, "Alice"));
        employeeMap.put(2, new Employee(2, "Bob"));

        // Access a POJO by key
        Employee emp = employeeMap.get(1);
        System.out.println(emp);  // Output: Employee{id=1, name='Alice'}
    }
}
