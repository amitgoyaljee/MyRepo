package Prg;


class varArgs1 {
    // The varrags allows the method to accept zero or muliple arguments.
    // Before varargs either we use overloaded method or take an array as the method parameter
    //There can be only one variable argument in the method.
    //Variable argument (varargs) must be the last argument.
     void fun(String s,int... a)
    // static void fun(String... a)
    {
        System.out.println("Number of arguments: "
                + a.length);

        // using for each loop to display contents of a
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
     void fun2(String... a)
    // static void fun(String... a)
    {
        System.out.println("Number of arguments: "
                + a.length);
        for (String i : a)
            System.out.print(i + " ");
        System.out.println();
    }

        // Driver code
    public static void main(String args[])
    {
        // Calling the varargs method with
        // different number of parameters
        varArgs1 varArg=new varArgs1();
        // one parameter
        varArg.fun("s",100);

        // four parameters
        varArg.fun("as",1, 2, 3, 4);

        // no parameter
        varArg.fun("q");
        varArg. fun2();
        varArg.fun2("amit");
    }
}

class Varargs{

    static void display(int num, String... values){
        System.out.println("number is "+num);
        for(String s:values){
            System.out.println(s);
        }
    }

    public static void main(String args[]){

        display(500,"hello");//one argument
        display(1000,"my","name","is","varargs");//four arguments
    }
}