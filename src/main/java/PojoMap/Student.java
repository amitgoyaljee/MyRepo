package PojoMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
    // The toString() method in Java is
    // used to provide a human-readable string representation of an object.
    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

class PojoAsKeyExample {
    public static void main(String[] args) {
        Map<Student, String> studentGrades = new HashMap<>();

        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Jane");

        studentGrades.put(s1, "A");
        studentGrades.put(s2, "B");

        // Get grade using the same POJO
        System.out.println(studentGrades.get(s1));  // Output: A

        // Get grade using a new but equal POJO
        Student s3 = new Student(101, "John");
        System.out.println(studentGrades.get(s3));  // Output: A (only if equals & hashCode overridden)
    }
}


 class ZeroKeyNullValueMap {
    public static void main(String[] args) {
        // Create a map
        Map<Integer, String> map = new HashMap<>();

        // Put 0 as key and null as value
        map.put(0, null);
        map.put(0, "aaa");
        map.put(0, "bbb");
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
