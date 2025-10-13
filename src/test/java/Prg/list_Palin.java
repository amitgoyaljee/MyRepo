package Prg;

import org.testng.annotations.Test;

import java.util.*;

public class list_Palin {
    @Test
    public void sortinList() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("mango");
        list.add("app");
        list.add("bbb");
        list2.add("mango");
        list2.add("app");
        list2.add("bbb");
        System.out.println(list);
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list);
        System.out.println(list.equals(list2));
    }


    @Test
    public void PalinDigit() {
        int n = 123;
        int rev = 0;
        int r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println("rev-------------" + rev);
    }

    @Test
    public void sumofDigit() {
        int n = 123;
        int sum = 0;
        while (n > 0 || n > 9) {
            sum =sum+ n % 10;
            n = n / 10;
        }
        System.out.println("sum-------------" + sum);
    }

    @Test
    public void stringPalin() {
        String str = "nitin";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("rev-------------" + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrom");
        }
    }
    @Test
    public void stringPalinBuilder() {
        String str = "nitina";
        StringBuilder str1=new StringBuilder(str);
        String rev = str1.reverse().toString();
        System.out.println("rev-------------" + rev);
        if (str1.equals(rev)) {
            System.out.println("Pal indrom");
        }else {
            System.out.println("Not  Palindrom");
        }
    }

    public static void countCharFrequencies(ArrayList<String> list) {
        char[] chars = list.toString().toCharArray();//char[] chars1 = String.valueOf(list).toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch2 : chars) {
            if (!map.containsKey(ch2)) {

                map.put(ch2, 1);
            } else {
                map.put(ch2, map.get(ch2) + 1);
            }
        }
        System.out.println("countCharFrequencies---"+map);

    }
    public static void countFrequencies2(ArrayList<String> list) {
        String [] chars = list.toString().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String ch2 : chars) {
            if (!map.containsKey(ch2)) {
                map.put(ch2, 1);
            } else {
                map.put(ch2, map.get(ch2) + 1);
            }
        }
        for (Map.Entry en : map.entrySet()) {
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }
    }
    public static void countFrequencies(ArrayList<String> list) {
        Set<String> st = new HashSet<String>(list);
        for (String s : st)
            System.out.println(s + ": " +
                    Collections. frequency(list, s));///----------frequency
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        countFrequencies(list);
        countFrequencies2(list);
        countCharFrequencies(list);
    }


    @Test
    public void missingNoinArray() {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12};

        int N1 = numbers[numbers.length - 1];  //The last element in the array
        int N = Arrays.stream(numbers).max().getAsInt();//The last element in the array
        System.out.println(N1);
        System.out.println(N);
        int expectedSum = (N * (N + 1)) / 2;
        int actualSum = Arrays.stream(numbers).sum();
        int missingNumber = expectedSum - actualSum;
        System.out.println("missingNumber---------" + missingNumber);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] - numbers[j] == 1) {
                }else{
                    System.out.println("missingNumber-  2nd method--------" + numbers[i]);
                    numbers[j]=  numbers[j]+1;
                    System.exit(0);
                }

                }
            }
        }

    @Test // make a list then chk n-1==1 not then add (n-1)+1
    public void missingMultipleNoinArray() {
        int[] ints = {1, 2, 3, 12};
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i : ints) {
            numbers.add(i);
        }
        numbers.add(9);
        numbers.add(6);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(0);
        Integer[] intss = {1, 2, 3, 12};

        // or
        List<Integer> numbers1 = Arrays.asList(intss);


        System.out.println(numbers1);
        Collections.sort(numbers);
        System.out.println(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) - numbers.get(i - 1) == 1) {//i-1 is not present

            } else {
                System.out.println("Missing number is " + (numbers.get(i - 1) + 1));
                numbers.add((numbers.get(i - 1) + 1));
                Collections.sort(numbers);
            }
        }
        System.out.println(numbers);
    }

    @Test
    public void missingOnesinArray() {
        int[] ints = {1, 2, 3, 12};
       Arrays.stream(ints).sorted();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] - ints[i - 1] == 1) {//i-1 is not present
            } else {
                Arrays.stream(ints).sorted();
            }
        }
        System.out.println(ints);
    }
}
