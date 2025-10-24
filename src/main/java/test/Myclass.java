package test;
//1) Checked Exception
//The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked
// exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
//2) Unchecked Exception
//The classes that inherit the RuntimeException are known as unchecked exceptions. For example,
// ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions
// are not checked at compile-time, but they are checked at runtime.
//3) Error
//Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

public class Myclass {
   // public static void main(String[] args){
   //     System.out.println("aaaaa");
  //  }

}

class TestThrow1 {
    //function to check if person is eligible to vote or ------not--only in checked
    public static void validate(int age) { // no need throws ArithmeticException unchecked {////// throws is not necessary
        if(age<18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    //main method
    public static void main(String args[]){
        //calling the function
        validate(13);
        System.out.println("rest of the code...");
    }
}


class TestThrows {
    //function to check if person is eligible to vote or not===checked exception
    public static void validate(int age) throws ClassNotFoundException {////// throws is necessary for checked
        if(age<18) {

            throw new ClassNotFoundException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
//    //main method
//    public static void main(String args[]) throws ClassNotFoundException {
//        //calling the function
//        validate(13);
//        System.out.println("rest of the code...");
//    }
//}
//  or
// main method
    public static void main(String args[]) {//throws ClassNotFoundException or use try catch {//--------------no need throws
        //calling the function
        try {                     // -------------------------------------------
            validate(13);
            System.out.println("rest of the code...");
        } catch (ClassNotFoundException e) {// ----------------------------------------------------

        }
    }
}

class TestThrows2 {
    //function to check if person is eligible to vote or not
    public static void validate(int age) throws ClassNotFoundException {
        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ClassNotFoundException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    //main method
    public static void main(String args[]) {
        //calling the function
        try {
            validate(13);
            System.out.println("rest of the code...");
        } catch (Exception e) {
            System.out.println("ssssssssssssssssssss");
        }
    }
}

class SuperClass {
    public SuperClass() {
        System.out.println("Inside SuperClass constructor.");
    }
}

 class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("Inside SubClass constructor.");
    }
}

class  ClassCastException_ {
    public static void main(String[] args) {
        SuperClass superObject = new SuperClass();
        SubClass subObject = new SubClass();
        superObject = subObject; // Valid statement
     //  subObject = superObject; //Class cast exception here----compile time
        subObject =(SubClass) superObject;   //Class cast exception here----Run time
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

// There are two main types of custom exceptions:
// 1. Custom Checked Exception (extends Exception)
//2. Custom Unchecked Exception (extends RuntimeException)



// Custom Checked Exception checked_Compile
        class InvalidAgeException extends Exception {
            public InvalidAgeException(String m) {
                super(m);
            }
        }
// Using the Custom Exception
class checked_Compile {
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) throws InvalidAgeException {
      //  try {
            validate(12);
       // } catch (InvalidAgeException e) {
           // System.out.println("Caught Exception: " + e.getMessage());
        }
    }
//}
/////////////////////////////////////////////////////////////////////////////
// Custom Unchecked Exception Unchecked_Runtime
class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String m) {
        super(m);
    }
}
// Using the Custom Exception
class Unchecked_Runtime {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (DivideByZeroException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
