package Prg;

import org.testng.annotations.Test;

import java.util.*;

public class String_ {

    @Test
    public void stringBasic1() {
        String s = "Sachin";
        String ss = "Sachin";
        System.out.println(s == ss);
        //o/p--true
    }

    @Test
    public void stringBasic2() {
        String s = "Sachin";
        String ss = "Sachin";
        System.out.println(s.equals(ss));
        //o/p--true
    }

    @Test
    public void stringBasic3() {
        String s = "Sachin";
        String s1 = new String("Sachin");
        String ss1 = new String("Sachin");
        System.out.println(s == (s1));  //false
        System.out.println(s1 == (ss1)); //false
        System.out.println(s.equals(s1)); //true
        System.out.println(s1.equals(ss1));//true
    }

    //
    @Test
    public void stringBasic() {
        String s = "Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//--Sachin
        s = s.concat(" Tendulkar");
        System.out.println(s);//--Sachin Tendulkar
    }

    @Test
    public void mySplit() {
        String str = "am01$$";
        StringBuffer alpha = new StringBuffer();//StringBuffer is synchronized, meaning its methods are thread-safe
        StringBuffer num = new StringBuffer();
        StringBuffer special = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alpha.append(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else {
                special.append(str.charAt(i));
            }
        }
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);
    }
    @Test
    public void mySplitForEach() {
        String str = "am01$$";
        char []ch=str.toCharArray();
        StringBuffer alpha = new StringBuffer();//StringBuffer is synchronized, meaning its methods are thread-safe
        StringBuffer num = new StringBuffer();
        StringBuffer special = new StringBuffer();
        for (Character chEach:ch) {
            if (Character.isAlphabetic(chEach)) {
                alpha.append(chEach);
            } else if (Character.isDigit(chEach)) {
                num.append(chEach);
            } else {
                special.append(chEach);
            }
        }
        System.out.println(alpha);
        System.out.println(num);
        System.out.println(special);

        System.out.println("digit"+str.replaceAll("[\\D]",""));
        System.out.println("alpha"+str.replaceAll("[\\W\\d]",""));
        System.out.println("special"+str.replaceAll("[\\d\\w\\s]",""));
    }
    @Test
    public void randomNoGen() {
        String str = "amscfhjwqjdjqfhjhe";
        String str1="";
        StringBuffer sb = new StringBuffer();
         Random rnd = new Random();
        while (sb.length() < 6) {
            int index = rnd.nextInt(16);///length--amscfhjwqjdjqfhjhe--18
            //or
            int index1= rnd.nextInt(str.length());
            sb.append(str.charAt(index));
            //or
            str1+=str.charAt(index);
        }
        System.out.println(sb.toString());
        System.out.println(str1);
    }

    @Test
    public void replaceMatc() {
        // d->digit w->char+digit s->space
        // Which required --> caps D,W,S      not required-> small d,w,s
        String str = "amscfhjwqjdjqfhjhe123 @#$";
        String digit = str.replaceAll("[\\D]", "");
        System.out.println("digit----" + digit);//digit----123
        // if we use //D than // and D will ignore so---use only\\
        String string = str.replaceAll("[\\W\\d]", "");
        System.out.println("String---" + string);//String---amscfhjwqjdjqfhjhe
        String spcl = str.replaceAll("[\\W]", "");
        System.out.println("spcl----" + spcl);//spcl----amscfhjwqjdjqfhjhe123
        String spclExclude = str.replaceAll("[\\w\\s]", "");
        System.out.println("spclExclude----" + spclExclude);//spclExclude---- @#$
    }
    @Test
    public void replaceMatc2() {
        // d->digit w->char+digit s->space
        // Which required --> caps D,W,S not required-> small d,w,s
        String str = "amscfhjwqjdjqfhjhe123 @#$";
        String digit = str.replaceAll("[\\D]", "");
        System.out.println("digit----" + digit);//digit----123
        String ch = str.replaceAll("[\\W\\d]", "");
        System.out.println("char----" + ch);//digit----amscfhjwqjdjqfhjhe
        String spl = str.replaceAll("[\\d\\w\\s]", "");
        System.out.println("spl----" + spl);//digit----@#$
    }
    @Test
    public void reverseSen() {
        String str = "my name is amit";
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());
        //tima si eman ym
        }


    @Test
    public void reverseWords() {
        String str = "my name is amit";
        String str2[] = str.split(" ");
        int i = str2.length;
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(str2[j] + " ");
            //amit is name my
        }
    }

    @Test
    public void occuranceFirstChar() {
        String str = "amscfhamscaa";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch2 : ch) {
            if (map.containsKey(ch2)) {
                map.put(ch2, map.get(ch2) + 1);
                break;
            } else {
                map.put(ch2, 1);
            }
        }
        System.out.println("map---------" + map);
        Integer value = 2;
        //// by for loop
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
            }
        }
//// by iterator
        Integer value2 = 2;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry en = (Map.Entry) it.next();
            if (en.getValue() == value2) {
                System.out.println("The key for value using Iterator " + value + " is " + en.getKey());
            }
        }
    }

    @Test
    public void subString_() {
        String str = "abcdef name is amit";
        System.out.println(str.substring(1, 3));//bc   last index ignore always
        System.out.println(str.substring(3));//def name is amit, ignore first 3(0,1,2)
    }

}

class    GFG {

    // Function to print all the permutations of str
    static Set<String> set = new HashSet<>();

    // Function to print unique permutations
    static void printPermutn(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            if (!set.contains(ans)) {
                set.add(ans);
                System.out.print(ans + " ");
            }
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abb";
        printPermutn(s, "");
    }

}

class SwapCaseSmallToCaps {
    public static void main(String[] args) {
        String input = "VaPs To SmAlL aNd SmAlL To CaPs";
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c); // keep non-alphabet characters as is
            }
        }
        System.out.println("Original: " + input);
        System.out.println("Swapped:  " + sb.toString());
////////////////////////////////////////////////////////////////////////
        String input2 = "VaPs To SmAlL aNd SmAlL To Cdhwdjkhw";
        String upperCase = input2.toUpperCase();

        System.out.println("Original: " + input);
        System.out.println("All Caps: " + upperCase);
/////////////////////////////////////////////////////////////////
        String input3 = "VaPs To SmAlL aNd SmAlL To CaPs";
        StringBuilder upperCase2 = new StringBuilder();

        for (int i = 0; i < input3.length(); i++) {
            char c = input3.charAt(i);

            // If character is lowercase (a-z), convert to uppercase using ASCII
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32); // Convert to uppercase  'a' has an ASCII value of 97
                                                            //'z' has an ASCII value of 12
                                  // c = (char)(c - 32); // Turns 'a' into 'A', 'b' into 'B', etc.
            }
            upperCase2.append(c);
        }
        System.out.println("Original: " + input3);
        System.out.println("All Caps: " + upperCase2.toString());
    }
    }


