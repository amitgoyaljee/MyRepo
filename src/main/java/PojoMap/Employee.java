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
        employeeMap.put(myEnum.TransId1.getTransId1(), emp1);//  employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(2, emp2);

        // Retrieve and print employee by ID
        Employee retrieved = employeeMap.get(2); // will returm emp2 data
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

enum myEnum {
    TransId1(1), TransId2(2);
    int c;
    myEnum(int c){
        this.c=c;
    }
    public int getTransId1(){
        return c;
    }
//    public static void main(String[] args) {
//        myEnum m= myEnum.s;
//
//        System.out.println("m.getc()----------"+m.getc());
//        System.out.println("my.s----------"+ myEnum.s.getc());
//        System.out.println("my.s----------"+ myEnum.y.getc());
//
//    }
}

class ZeroKeyNullValueMap {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();

        // Put 0 as key and null as value
        map.put(0, null);
        map.put(0, "aaa");
        map.put(0, "bbb");// override
        System.out.println("Value at key override: " + map.get(0));//Value at key 0: bbb


        // Add more data if you like
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, null);
        map.put(4, null);

        // Print the map
        System.out.println("Map contents: " + map);

        // Access value for key 0
        String value = map.get(0);
        System.out.println("Value at key 0: " + value); // Should print: null

        // Check if key 0 exists
        System.out.println("Contains key 0? " + map.containsKey(0)); // true

        // Check if null value exists
        System.out.println("Contains value null? " + map.containsValue(null)); // true

        System.out.println("3rd key " + map.get(3)); //3rd key null
    }
}



