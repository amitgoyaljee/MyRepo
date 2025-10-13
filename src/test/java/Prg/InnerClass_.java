package Prg;

public class InnerClass_ {
}

class OuterClass {
        int x = 10;

class InnerClass {
    int y = 5;
}
}

class Main1 {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        //OuterClass.InnerClass myInner1 = myOuter.new InnerClass();
        OuterClass.InnerClass myInner = new OuterClass().new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}


class OuterClass2 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

class Main2 {
    public static void main(String[] args) {
        OuterClass2.InnerClass myInner = new OuterClass2.InnerClass();
        System.out.println(myInner.y);
    }
}


class OuterClass3 {
        int x = 10;
    private static int xx = 20;
       class InnerClass {                  // static class can not acces x
           // private data member x---
           // static class InnerClass {
           //but her normal class can access both
            public int myInnerMethod() {
                return x*xx;
            }
        }
    }

    class Main3 {
        public static void main(String[] args) {
            OuterClass3 myOuter = new OuterClass3();
            OuterClass3.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.myInnerMethod());
        }
}

class OuterClass4 {
    private static int x = 10;
    private  int y = 10555;
    static class InnerClass {                  // static class can not acces private data member--- static class InnerClass {
        public int myInnerMethod() {
            return x;
        }
//        public int myInnerMethod() {------not possible
//            return y;
//        }
   }
}

class Main4 {
    public static void main(String[] args) {

        OuterClass4.InnerClass myStaticInner =new OuterClass4.InnerClass();
        System.out.println(myStaticInner.myInnerMethod());
    }
}

