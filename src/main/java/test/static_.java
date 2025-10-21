package test;


// overriding run time but static compile time, always refer parent data hiding
public class static_ {
         void my(){
            System.out.println("parent");
        }
    }
class  b extends static_{
    void my(){
        System.out.println("child");
    }
}

class mainClass {
    public static void main(String s[]){
        static_ so=new b();
        so.my();
    }
}
// o/p  child

//public class static_ {
//         void my(){
//            System.out.println("parent");
//        }
//    }
//class b extends static_{
//    void my(){
//        System.out.println("child");
//    }
//}
//class main {
//    public static void main(String s[]){
//        static_ so=new b();
//        so.my();
//    }
//}

//  o/p will be child

class StaticBlockExample {
    static int a;

    static {
        System.out.println("Static block is executed.");
        a = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        System.out.println("Value of a: " + a);
    }
    //Static block is executed.
    //Main method started.
    //Value of a: 10
}
