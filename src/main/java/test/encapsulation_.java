package test;

public class   encapsulation_ {

}
//Encapsulation in Java refers to integrating data (variables) and code (methods) into a single unit.
// In encapsulation, a class's variables are hidden from other classes and can only be accessed by the
// methods of the class in which they are found.
 class Person {
    private String name="amit"; // private = restricted access

    public void myfun() {
       int m=10;
        // public int k=10;   //Modifier static &  'public' not allowed here for local variable
        //static int k1=10;
      getM(m);
    }
    public void getM(int m){
        System.out.println("m"+m);
    }
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
 class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println(myObj.getName());
      //  myObj.name = "John";  // error
       // System.out.println(myObj.name); // error
        myObj.setName("amit2nd");   //we can set
        System.out.println(myObj.getName());
    }
}
class Person1 {

int a =2, b=4, d=6,c=a=d=b;

    public void myfun() {
        System.out.println("my fun--------"+c);
        System.out.println("my funa--------"+a);
        System.out.println("my fund--------"+d);
        System.out.println("my funb--------"+b);
        //my fun--------4
        //my funa--------4
        //my fund--------4
        //my funb--------4
    }
}

class Main1{
    public static void main(String[] args) {
        Person1 myObj = new Person1();
       myObj.myfun();
       //myObj=new Person2();//  compile time error

    }
}
 // DataType.toString(ob);         ----to string        --->  Arrays.toString(objArray)
// dataType.valueOf(ob)---------covert to dataType      --->Integer.valueOf(str2)

class dataTypeConversion {  //Integer.valueOf(str2)---  String.valueOf(num3)  ....best method
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num); //// Output: 123

        String str2 = "456";   ///Integer.valueOf(str2)---  String.valueOf(num3)
        int num2 = Integer.valueOf(str2); // returns Integer, auto-unboxed to int
        System.out.println(num2); // Output: 456
///////////////////////////////////////////////////////////////////////
        int num3 = 123;
        String str3 = String.valueOf(num3);  //Integer.valueOf(str2)---  String.valueOf(num3)
        System.out.println(str3); // Output: "123"

        int num4 = 456;
        String str4 = Integer.toString(num4);
        System.out.println(str4); // Output: "456"

        int num5 = 789;
        String str5 = "" + num5;
        System.out.println(str5); // Output: "789"

        int num6 = 7899;
        // String str6 = num6;// compile time error
        String str6 = num6 + "";
        System.out.println(str6); // Output: "7899

        char ch = 'c';
        int charI = Integer.valueOf(ch);
        System.out.println(charI);

        char ch2 = 'c';
        String stringI = String.valueOf(ch2);
        System.out.println(stringI);

    }
}
 class HighestWordValue {
        public static void main(String[] args) {
            String input = "abc def ghij"; // Input string
            String[] words = input.split(" "); // Split into words
            String highestWord = "";
            int highestValue = 0;
            for (String word : words) {
                int wordValue = 0;
                for (char c : word.toCharArray()) {
                   // if (Character.isLetter(c)) {
                    {
                        c = Character.toLowerCase(c); // Convert to lowercase
                        wordValue += c - 'a' + 1;     // a=1, b=2, ..., z=26
                    }
                }
                System.out.println("Word: " + word + " | Value: " + wordValue);
                if (wordValue > highestValue) {
                    highestValue = wordValue;
                    highestWord = word;
                }
            }
            System.out.println("\nHighest value word: " + highestWord + " (Value: " + highestValue + ")");
        }
    }

