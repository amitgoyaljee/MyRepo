package test;

public class Interface_Default {
}
// A simple program to Test Interface default
// methods in java
interface TestInterface
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }

    static void show222()
    {
        System.out.println("static static Method Executed");
    }
}

class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();

        //or
        // TestInterface d = new TestClass();

        d.square(4);

        // default method executed
        d.show();
        TestInterface.show222();

    }
}
class ExitExample {
    public static void main(String[] args) {

        System.out.println("Program started");

        // Option 1: Use return
        if (args.length == 0) {
            System.out.println("No arguments provided, exiting using return...");
            return;  // Ends only main() method
        }

        // Option 2: Use System.exit()
        if (args.length > 0 && args[0].equals("exit")) {
            System.out.println("Exiting using System.exit(0)...");
            System.exit(0);  // Ends the entire program immediately
        }

        System.out.println("Program finished normally");
    }
}
