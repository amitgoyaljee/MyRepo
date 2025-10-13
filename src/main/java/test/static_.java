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