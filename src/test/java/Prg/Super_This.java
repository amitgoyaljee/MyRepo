package Prg;

public class Super_This {
}
class Animal{
    public int a=10;
    public void getAnimal(){
        System.out.println("super class method");
    }
    Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{

    public void getDog(){
        System.out.println(super.a);// 1st use
        super.getAnimal();// 2nd use
    }
    Dog(){
        super();// 3 rd use
        System.out.println("dog is created");
     //  super(); always before not here
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog d=new Dog();
        d.getDog();
    }}

//11111111this: to refer current class instance variable
    //If local variables(formal arguments) and instance variables are different,
    // there is no need to use this keyword like in the following program:
class Student{
    int rollno;
    String name;
    float fee;
    Student(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis3{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}


//If local variables(formal arguments) and instance variables are different,
// there is need need  need to use this keyword like in the following program:
class Student1{
    int r;
    String n;
    float f;
    Student1(int r,String n,float f){
        this.r=r;  // 1st Use
        this.n=n;
        this. f=f;
    }
    void display(){System.out.println(r+" "+n+" "+f);}
}

class TestThis222{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit",5000f);
        Student s2=new Student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}
    //2) this: to invoke current class method

class A{
    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
//m();//same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        A a=new A();
        a.n();
    }}


    //3) this() : to invoke current class constructor
    class A1{
        A1(){System.out.println("hello a");}
        A1(int x){
            this();//current class constructor
            System.out.println(x);
        }
    }
class TestThis5{
    public static void main(String args[]){
        A1 a=new A1(10);
    }}