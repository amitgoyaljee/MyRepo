package Prg;

import org.testng.annotations.Test;

import java.util.*;

public class
array_ {
    @Test// length length() size() use
    public void myyy(){
        int[] arr = {1, 2, 3};
        System.out.println(arr.length);///////////////////    length

        String name = "Java";
        System.out.println(name.length());//////////////////////////    length())

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println(fruits.size());//////////////////////////////    size()
    }
}

class Main {

    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //printf   %d %d
                    System.out.printf("Pair found (%d & %d)", nums[i], nums[j]);
                    System.out.println(nums[i] + "   " + nums[j]);
                   //
                    // break;
                }
            }
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] nums = {8, 7, 2, 5, 3, 1,12,-2};
        int target = 10;
        findPair(nums, target);
    }
}

//https://www.programming9.com/tutorials/competitive-programming/426-pair-with-given-sum-in-an-array
 class PairSum {
    public  void isPairAvailable(int arrayLength,int Sum,int input_array[])
    {
        int left = 0,right = arrayLength-1;
        while (left < right)
        {
            if (input_array[left] + input_array[right] == Sum)
            {
                System.out.println("The two numbers are "+input_array[left] +" and "+ input_array[right]);

            }
         if (input_array[left] + input_array[right] > Sum) {
             right--;
         }//decrementing the right index
            //if (input_array[left] + input_array[right] < Sum) {
            else{
                left++;
            }//incrementing the left index
        }

    }
    public static void main(String arg[]) {
        int Sum = 5, input_array[] = {1, 5, 3, -2, 4, 7};
        Arrays.sort(input_array);//sorting the array in ascending order
        for(int sm:input_array){
        System.out.println("" + sm);
    }
        int arrayLength = input_array.length;
        PairSum p=new PairSum();
        p.isPairAvailable(arrayLength, Sum, input_array);//calling the function
    }
}

class round {
    public static void main(String args[]) {
        float d1 = 84.6f;
        float d2 = 0.45f;

        System.out.println("Round off for d1 inttttttttttt: " + (int) d1);
        System.out.println("Round off for math d1: " + Math.round(d1));
        System.out.println("Round off for d2: " + Math.round(d2));
        System.out.println("Ceiling of '" + d1 + "' = " + Math.ceil(d1));
        System.out.println("Floor of '" + d1 + "' = " + Math.floor(d1));
        System.out.println("Ceiling of '" + d2 + "' = " + Math.ceil(d2));
        System.out.println("Floor of '" + d2 + "' = " + Math.floor(d2));
//Round off for d1 inttttttttttt: 84
//Round off for math d1: 85
//Round off for d2: 0
//Ceiling of '84.6' = 85.0
//Floor of '84.6' = 84.0
//Ceiling of '0.45' = 1.0
//Floor of '0.45' = 0.0

    }
}

class UserInputDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str = sc.nextLine();              //reads string
        System.out.println("You have entered: " + str);

        System.out.print("Enter a int: ");
        int in = sc.nextInt();              //reads int
        System.out.print("You have entered: " + in);
    }
}

class  secondLargestNumberInAnArray {
    public static void main(String args[]) {
        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57,20,55,89,90,100};
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                // single loop not working for sorting   if (array[i] > array[i+1]) {
//array sort
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(" second largest number is:: " + array[size - 2]);
    }
}

class secondLargestNumberSample {
    public static void main(String args[]) {
        int array[] = {10, 20, 25, 63, 96, 57};
        int size = array.length;
        Arrays.sort(array);//sorting array
        //or
        Arrays.stream(array).sorted();//sorting array

        System.out.println("array" + Arrays.toString(array));
        System.out.println("array" + array);

        //or
        Arrays.sort(array);
        System.out.println("sorted Array ::" + Arrays.toString(array));

        int res = array[size - 2];
        System.out.println("2nd largest element is ::" + res);
    }
}

class secondCharOccurence {
    public static void main(String args[]) {
        String ss = "abcdaba";
        char array[] = ss.toCharArray();
        int size = ss.length();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    System.exit(0); //output  a
                }
            }
        }
    }
}

class series {
    public static void main(String args[]) {
        int a = 2, n = 4, i = 0;
        for (i = n; i > 0; i--) {
            double ss = Math.pow(a, i);
            System.out.println("value----------" + ss);
        }
    }
}
class fact {
    public static void main(String args[]) {
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
class power {
    public static void main(String args[]) {
        int base = 3, exponent = 4;
        long result = 1;
        //for(int i=exponent;i>0;i--){
            for(int i=0;i<exponent;i++){
            result =result* base;
        }
        System.out.println("Answer = " + result);
    }

}
class Solution{
    public static void main(String[] args){
        byte x = 125;// -128 to 127. But the byte data type in java is cyclic in nature.
       // x++;//126
        x++;//127
        ++x;// -128

        System.out.print(x);
    }
}
class Main11 {
    public static void main(String args[]) {
        System.out.println(fun());
    }

    //public static void main(String args[]) {
    //          Main obj = new Main();
    //        System.out.println(obj.fun());
    //    }
    //int fun() {
    //        return 20;
    //    }
   static int fun() {//int fun() { compiler error
        return 20;
    }
}

class FibonacciExample1 {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
   class ArrayToList {
        public static void main(String[] args) {
            // Example 1: Converting an array of Strings to a List
            String[] stringArray = {"Coding Hub", "for Enthusiasts", "A Tech Portal"};
            List<String> stringList = Arrays.asList(stringArray);
            System.out.println("List from String Array: " + stringList);

            // Example 2: Converting an array of Integers to a List
            Integer[] intArray = {1, 2, 3, 4, 5,9,6};
            List<Integer> intList = Arrays.asList(intArray);//---------------------------------------
            System.out.println("List from Integer Array: " + intList);
            Collections.sort(intList);
            System.out.println("sorted: " + intList);


            // Converting List to array
            // using toArray() method
            Integer[] arr = intList.toArray(new Integer[0]);//-----------------------------------

            // Printing elements of array
            // using for-each loop
            for (Integer x : arr)
                System.out.print(x + " ");
        }
    }


class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Outer loop to pick the first number
        for (int i = 0; i < nums.length; i++) {
            // Inner loop to pick the second number
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Return the indices
                }
            }
        }
        return new int[] {}; // Return empty array if no match found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Explanation: Because nums[" + result[0] + "] + nums[" + result[1] + "] == " +
                    (nums[result[0]] + nums[result[1]]) + ", we return [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
