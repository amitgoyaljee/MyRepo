package test;

public class interAbs {
    // Java Program to Illustrate Concept of Constructors in " Abstract Class"
//  so that we can intialize the data member
    // Class 1
// Helper Abstract class
// Parent class
}
    abstract class ConstructorInAbstract {
        int a;
        // Constructor of abstract class
        public ConstructorInAbstract(int a)
        {
            // This keyword refers to current instance itself
            this.a = a;
        }

        // Abstract method of abstract class
        abstract int multiply(int val);
    }

    // Class 2
// Helper class extending above Class1
// Child class of Abstract class
    class GFG extends ConstructorInAbstract {

        // Constructor of Child class GFG
        GFG()
        {
            // Super keyword refers to parent class
            super(2);
        }
        // Defining method the abstract method
        public int multiply(int val)
        {

            // Returning value of same instance
            return this.a * val;
        }
    }

    // Class 3
// Main class
    class GeeksforGeeks {
        public static void main(String args[])
        {

            // Creating reference object of abstract class
            // using it child class
            ConstructorInAbstract c = new GFG();

            // Calling abstract method of abstract class
            System.out.println(c.multiply(3));
        }
    }



