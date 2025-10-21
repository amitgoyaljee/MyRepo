package test;

public class interAbs {
//  so that we can intialize the data member
}
    abstract class ConstructorInAbstract {
        int a;
        public ConstructorInAbstract(int a)
        {// use to intilize data member
            this.a = a;
        }
        abstract int multiply(int val);
    }

    class GFG extends ConstructorInAbstract {
        GFG(int a)
        {
            super(a);
        }
        public int multiply(int val)
        {
            return this.a * val;
        }
    }
    class GeeksforGeeks {
        public static void main(String args[])
        {
            ConstructorInAbstract c = new GFG(2);
            System.out.println(c.multiply(3));
        }
    }



