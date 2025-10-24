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
        return rollNo == student.rollNo ;//&& Objects.equals(name, student.name);
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
        Student s3 = new Student(102, "Jane");
        System.out.println(studentGrades.get(s3));  // Output: A (only if equals & hashCode overridden)
    }
}


