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
