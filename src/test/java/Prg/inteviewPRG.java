package Prg;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class inteviewPRG {
    @Test
    public void rremoveAdjacent() throws Exception {
        String str = "myyy nameee issy ameit aeeeeaaa";
        char[] chArray = str.toCharArray();
        StringBuilder strBf = new StringBuilder();
        for (char chEach : chArray) {
            int len = strBf.length();
            if (len > 0 && strBf.charAt(len - 1) == chEach) {
                //or
                //  strBf.deleteCharAt(len-1);
            } else {
                strBf.append(chEach);
            }
        }
        System.out.println("reversed string is: " + strBf.toString());
    }

    ////////////////some prb with y
    @Test
    public void rremoveDuplicateAdjacent() throws Exception {
        String str = "myyynnnamemmmnnn";
        //char[] chArray = str.toCharArray();
        StringBuilder strBf = new StringBuilder();
        //for (char chEach : chArray) {
        for (int i = 0; i < str.length(); i++) {
            int len = strBf.length();
            if (len > 0 && strBf.charAt(len - 1) == str.charAt(i)) {
                //or
                //  strBf.deleteCharAt(len-1);
            } else {
                strBf.append(str.charAt(i));
            }
        }
        System.out.println("reversed string is: " + new String(strBf));
    }

    @Test
    public void myWithoutSpaceOccurance() {
        String str = "This is an actual Test";
        String str2 = str.replaceAll("[\\s]", "");
        //
        char[] ch = str2.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character chEach : ch) {
            if (!map.containsKey(chEach)) {
                map.put(chEach, 1);
            } else {
                map.put(chEach, map.get(chEach) + 1);
            }
        }
        map.forEach((x, y) -> System.out.println(x + "-----" + y));
//a-----3
//s-----3
//c-----1
//T-----2
//t-----2
//u-----1
//e-----1
//h-----1
//i-----2
//l-----1
//n-----1
    }

    ////////////////
    @Test
    public void removeDuplicateAll() throws Exception {
        String str = "myyy nyyanaame iamys s";
        char[] chArray = str.toCharArray();
        StringBuilder strBf = new StringBuilder();
        for (char chEach : chArray) {
            if (strBf.toString().contains(String.valueOf(chEach))) { //need to convert stBF & ch into-> string
            } else {
                strBf.append(chEach);
            }
        }
        System.out.println("Removed all duplicate : " + new String(strBf));
    }

    @Test
    public void myFun() {
        String str = "The cat under the roof";
        String reverse = "";
        int length_ = str.length();
        for (int i = length_ - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println("Reverse String-----" + reverse);
    }

    @Test
    public void reverseWord() {
        String str = "The cat under the roof";  //ehT tac redun eht foor
        String[] str2 = str.split(" ");
        System.out.println("Org String-----" + str2[0] + str2[1] + str2[2] + str2[3] + str2[4]);
        String reverse = "";
        for (String str3 : str2) {
            System.out.println("Every word---" + str3);
            for (int i = str3.length() - 1; i >= 0; i--) {
                reverse = reverse + str3.charAt(i);
            }
            reverse += " ";
        }
        System.out.println("Reverse String-----" + reverse);
    }

    @Test
    public void myFun3() {
        WebDriver driver;
        driver = new ChromeDriver();
        WebElement element = driver.findElement(By.id("submit"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        js.executeScript("arguments[0].scrollIntoView(true);", element);

        js.executeScript("arguments[0].value='Hello';", element);

        TakesScreenshot ts = (TakesScreenshot) driver;

        // Capture screenshot as file
        File source = ts.getScreenshotAs(OutputType.FILE);
//        Set<String> set=   driver.getWindowHandles();
//        for(String eachSet :set){
//            if(){
//
//            }
//        }

    }

    @Test
    public void myIndices() {
        int num[] = {0, 20, 10, 30, 10, 20, 0};
        // num= Arrays.stream(num).distinct().toArray();
        int target = 30;
        int length = num.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (num[i] + num[j] == target) {
                    int[] n = new int[]{i, j};
                    System.out.printf("Indices %d %d", num[i] ,num[j]);
                    System.out.println("[" + n[0] + " " + n[1] + "]" + num[i] + "," + num[j]);
                    System.out.println("index1--" + n[0] + " index2--" + n[1]);
                    System.out.println("num1---" + num[i] + "    num2---" + num[j]);
                    System.out.println("////////////////////////////////");
                }
            }
        }
    }

    @Test
    public void zeroByNumber() {
        int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // num= Arrays.stream(num).distinct().toArray();
        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i] / 2);
                }
        int n = 6;

        System.out.println("----num[n] ======"+arr[n] );
        System.out.println("----num[n] / 2======"+arr[n] / 2);
        n = arr[arr[n] / 2];// 6/2=3 position
        System.out.println("----n--"+n);
            }

//0
//1
//1
//2
//2
//3
//3
//4
//4
//----num[n] ======6
//----num[n] / 2======3
//----n--3

    @Test
    public void zeroAppendatLast() {
        int num[] = {1, 0, 4, 0, 6, 0, 9};
        int k = 0;
        int temp[] = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                temp[k++] = num[i];
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(temp));
    }

    @Test
    public void stringCompress() {
        String str = "aabbbss";
        //String str = "aa2bbb3s1";
        StringBuilder str2 = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {   // same as duplicate -1
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                str2.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        // Append the last character and its count
        str2.append(str.charAt(str.length() - 1)).append(count);

        System.out.println("Original: " + str);
        System.out.println("Compressed: " + str2);
    }
}

///////////////////////
class ReverseStringKeepSpecial {
    public static String reverseKeepSpecial(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Skip non-letter characters
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                // Swap letters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "a,b+$c5";
        String result = reverseKeepSpecial(input);
        System.out.println("Output: " + result); // Output: c,b$a
    }
}
///////////////////////
class ReverseString{
    public static String reverse_(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        return new String(arr);
    }
    public static void main(String[] args) {
        String input = "abc5";
        String result = reverse_(input);
        System.out.println("Output: " + result); // Output: 5cba
    }
}
////////////////////////////////////////////////////////////////////////////////////////////
class sawpSpeccialNot {
    public static void rev(char s[], int l, int r)
    {
        for (int i = l; i < r / 2; i++) {
            char temp = s[i];
            s[i] = s[r - 1 - i];
            s[r - 1 - i] = temp;
        }
    }
    public static void reverse(char s[])
    {
        // creating character array of size
        // equal to length of string
        char[] temp = new char[s.length];
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                    || s[i] >= 'A' && s[i] <= 'Z') {
                // storing elements in array
                temp[x] = s[i];
                x++;
            }
        }
        // reversing the character array
        rev(temp, 0, x);
        x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                    || s[i] >= 'A' && s[i] <= 'Z') {
                // updating the origional string
                s[i] = temp[x];
                x++;
            }
        }

        String revStr = new String(s);
        System.out.println("reversed string is: " + revStr);
    }
    // Driver Code
    public static void main(String[] args)
    {
        String str = "Ab,c,de!$";
        char[] charArray = str.toCharArray();
        reverse(charArray);
    }
}

class GFG3 {
    // Function that swap first and the last character of a string
    public static String swapFirstAndLast(String str)
    {
        char[] ch = str.toCharArray();
        // Swapping first and the last character of a string
        char temp = ch[0];
        ch[0] = ch[str.length() - 1];
        ch[str.length() - 1] = temp;
        // Converting character to string and return
        return String.valueOf(ch);
    }
    public static void
    main(String args[])
    {
        String str = "GeeksForGeeks";
        System.out.println(swapFirstAndLast(str));
    }
} //o/p-              GeeksForGeeks ->  seeksForGeekG

class OnlyCharsNoBuiltIn {
    public static void main(String[] args) {
        String str = "12aabs)))444mm";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if ch is between 'a' and 'z' OR between 'A' and 'Z'
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch);
            }
        }
    }
}
class OnlyCharsNoBuiltIn1 {
    public static void main(String[] args) {
        String str = "12aabs)))444mm";
        String str2="";
        char[] ch1 = str.toCharArray();
        for (char ch : ch1) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch);
                str2+=ch;
            }
        }  System.out.println(str2);
    }
}


