package test;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class factoryPattern {
}
//abstract class Cannot be instantiated: You cannot create objects of an abstract class. It must be extended by other classes.
//Can contain abstract methods: These are methods declared without any implementation (no method body) and must be implemented by
// any concrete subclass. An abstract method is also declared with the abstract keyword.
//Can contain concrete methods: These are regular methods with full implementations that can be inherited by subclasses.
// Can have fields, constructors, and static members: Similar to regular classes, abstract classes can define member variables,
// constructors, and static methods or fields.
// Subclasses must implement abstract methods: If a class extends an abstract class, it must either implement all the abstract
// methods inherited from the abstract class, or it must also be declared as an abstract class itself.

abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    //@override
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    //@override
    public void getRate() {
        rate = 7.50;
    }
}

class GetPlanFactory {

    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        return null;
    }
}

class GenerateBill {
    public static void main(String args[]) throws IOException {
        int units = 6;
        GetPlanFactory planFactory = new GetPlanFactory();
        Plan p = planFactory.getPlan("DOMESTICPLAN");
        //call getRate() method and calculateBill()method of DomesticPaln.

        // System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}

// Program to remove duplicates from a List in Java 8
class Duplicate_1_2
{
    public static void main(String[] args)
    {
        Integer []arr={1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5};
        List<Integer> list1 =Arrays.asList(arr);
        // input list with duplicates
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);
        // Construct a new list from the set constucted from elements
        // of the original list
        ///////////////111
        List<Integer> newList = list.stream()
            .distinct()
            .collect(Collectors.toList());

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);
///////////22222222222222
        //Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr));
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println("ArrayList with duplicates removed using set: "
                + set);
    }
}
class Duplicate_3{
    public static void removeDuplicateElements(int arr[], int n){
        System.out.println("---with duplicate--");
        for (int num : arr) {
            System.out.println(num);
        }
        //or  print Array
            System.out.println(Arrays.toString(arr));

        int[] temp = new int[n];
        int j=0;
        for (   int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
                // System.out.print(temp[i]);
            }
        } temp[j++] = arr[arr.length - 1]; // Last element


        for (int num : temp) {
            System.out.println("-----"+num); // will print 0 0 blank space
        }
        System.out.println("--temp.length---" + temp.length);
        for (int k = 0; k < j; k++) {  // up to j
            System.out.println("-----" + temp[k]);
        }
    }

    public static void main (String[] args) {
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
        Arrays.sort(arr);//sorting array
        int length = arr.length;
       removeDuplicateElements(arr, length);
    }
}

class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 3};
        // Bubble Sort using for loop
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        // Print sorted array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
class aq {

    public void printPP() {
        System.out.println("main");
    }
}

class
aaa extends aq {

    public void printPP() {
        System.out.println("main");
    }
  //  private void printPP() {
      //  System.out.println("main");
  //  }//'printPP()' in 'test.aaa' clashes with 'printPP()' in 'test.aq';
    // attempting to assign weaker access privileges ('private'); was 'public'
}

class aqaq
{
    public static void main(String[] args) {
        aq aqqqq= new aq();
        aqqqq.printPP();
    }
    }
//list to Array-String
 class GFGa {
    public static void main(String[] args)
    {
        List<String> list = new LinkedList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geekss");
        list.add("Practice");
        // Converting List to array    // using toArray() method
        String[] arr = list.toArray(new String[0]);
        //This tells Java to return a String[].
        //If you pass a String[0], Java knows the type and will size the array automatically.
        //System.out.print("arr.length========="+arr.length);
        // Printing elements of array
        // using for-each loop
        for (String x : arr)
            System.out.print(x + " ");
    }
}
//list to Array-integer     Integer[] arr = list.toArray(new Integer[0]);
// ArrayToList             List<String> list = Arrays.asList(array);
class GFGi {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        Integer[] arr = list.toArray(new Integer[0]);
        for (Integer x : arr)
            System.out.print(x + " ");
    }
}

    class ArrayToList {
        public static void main(String[] args) {
            String[] array = {"Apple", "Banana", "Orange"};

            List<String> list = Arrays.asList(array);

            System.out.println(list);  // Output: [Apple, Banana, Orange]
        }
    }
class UniqueNumberRange {
    // Function to check if all digits in the number are unique
    public static boolean hasUniqueDigits(int number) {
        boolean[] seen = new boolean[10]; // To track digits 0-9
        while (number > 0) {
            int digit = number % 10;
            if (seen[digit]) {// intially false if found then return false otherwise true
                System.out.println("----"+seen[digit]);
                return false; // Duplicate digit found
            }
            System.out.println("+++++++"+seen[digit]);
            seen[digit] = true;
            System.out.println("************"+seen[digit]);
            number /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int start = 1234;
        int end = 1244;
        System.out.println("Unique-digit numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (hasUniqueDigits(i)) {
                System.out.println(i);
            }
        }
    }
}
