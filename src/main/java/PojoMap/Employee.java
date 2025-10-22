package PojoMap;

import java.util.*;


class Employee {
    private int id;
    private MyName name;
    private List<String> courses;

    public Employee(int id, MyName name, List<String> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }
    public int getId() { return id; }
    public MyName getName() { return name; }
    public List<String> getCourses() { return courses; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", courses=" + courses + "}";
    }
}

class MyName {
    private String name;

    public MyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyName{name='" + name + "'}";
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create some employee data
        List<String> courses1 = Arrays.asList("Java", "Spring", "Docker");
        List<String> courses2 = new ArrayList<>();
        courses2.add("Python");
        courses2.add("Flask");

        Employee emp1 = new Employee(1, new MyName("Alice"), courses1);
        Employee emp2 = new Employee(2, new MyName("Bob"), courses2);

        // Store employees in a Map
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(1, emp1);//  employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(2, emp2);

        // Retrieve and print employee by ID
        Employee retrieved = employeeMap.get(1);
        System.out.println("Retrieved ID: " + retrieved.getId());
        System.out.println("Retrieved Name: " + retrieved.getName());
        System.out.println("Retrieved Courses: " + retrieved.getCourses());

        // Loop through all employees
        System.out.println("\nAll Employees:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

class MainWithJavaObject {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java", "Spring", "Docker");

        MyName name = new MyName("Alice");
        Employee employee = new Employee(1, name, courses);

        System.out.println(employee);
    }
}





