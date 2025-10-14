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
        char [] chArray = str.toCharArray();
        StringBuilder strBf= new StringBuilder();
        for (char chEach : chArray) {
            int len= strBf.length();
            if(len> 0 && strBf.charAt(len-1)==chEach ){
                strBf.deleteCharAt(len-1);
            }else{
                strBf.append(chEach);
            }
        }  System.out.println("reversed string is: " + strBf.toString());
    }

////////////////some prb with y
@Test
public void rremoveDuplicateAdjacent() throws Exception {
    String str = "myyynnnamemmmnnn";
    char [] chArray = str.toCharArray();
    StringBuilder strBf= new StringBuilder();
    //for (char chEach : chArray) {
    for(int i=0;i<str.length();i++){
        int len= strBf.length();
       if(len> 0 && strBf.charAt(len-1)==str.charAt(i) ){
           strBf.deleteCharAt(len-1);
       }else{
           strBf.append(str.charAt(i));
       }
    }  System.out.println("reversed string is: " + new String(strBf));
}

    @Test
    public void myWithoutSpaceOccurance() {
        String str ="This is an actual Test";
        String str2 =str.replaceAll("[\\s]","");
        //
        char []ch= str2.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(Character chEach:ch){
            if(!map.containsKey(chEach)){
                map.put(chEach,1);
            }else{
                map.put(chEach,map.get(chEach)+1);
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
        char [] chArray = str.toCharArray();
        StringBuilder strBf= new StringBuilder();
        for (char chEach : chArray) {
            if(strBf.toString().contains(String.valueOf(chEach))){ //need to convert stBF & ch into-> string
            }else{
                strBf.append(chEach);
            }
        }  System.out.println("Removed all duplicate : " + new String(strBf));
    }

    @Test
    public void myFun() {
        String str = "The cat under the roof";
        StringBuilder sb= new StringBuilder();
        String reverse= "";

        int length_ = str.length();

        for (int i = length_ - 1; i >=0; i--) {
            reverse= reverse+ str.charAt(i);

        }
        System.out.println("Reverse String-----"+reverse);
    }

    @Test
    public void myFun2() {
        String str = "The cat under the roof";  //ehT tac redun eht foor
        String [] str2=str.split(" ");
        System.out.println("Org String-----"+str2[0]+str2[1]+str2[2]+str2[3]+str2[4]);
        String reverse= "";

        for(String str3:str2) {
            System.out.println("Every word" + str3);
            int length_ = str3.length();
            for (int i = str3.length() - 1; i >= 0; i--) {
                reverse = reverse + str3.charAt(i);


            }   reverse+=" ";System.out.println("Reverse String-----"+reverse);
        }

    }
    @Test
    public void myFun3() {
        WebDriver driver;
        driver= new ChromeDriver();
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
    public void myIndices(){
        int num [] =  {-20,10, 20,10, 25, 63, 96, 57};
        int target= 30;
        int length= num.length;
        for( int i=0;i< length;i++){
            for( int j=i+1;i< length;i++){
                if(num[i]+num[j]==target){
//                    int [] n= new int[] { i, j };
//                    System.out.println("num1--  "+ n[0] +"   num2 -- "+n[1]);
                    System.out.println("num1  "+ num[i]+"    num2      "+num[j]);
                }
            }
        }
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
                // Swap letters
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

class GfG2 {
    // Function to recursively remove adjacent duplicates
    static String rremove(String s)
    {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Flag to check if the current character is repeated
            boolean repeated = false;
            // Check if the current character is the same as the next one
            while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                // Mark as repeated
                repeated = true;
                // Skip the next character since it's a duplicate
                i++;
            }
            // If the character was not repeated, add it to the result string
            if (!repeated)
                sb.append(s.charAt(i));
        }
        // If no changes were made, return the result string
        if (n == sb.length()) {
            return sb.toString();
        }
        // Otherwise, recursively call the function to check for more duplicates
        return rremove(sb.toString());
    }

    public static void main(String[] args){
        String s = "myyy namee isss amitttt";
        String result = rremove(s);
        System.out.println(result);
    }
} //o/p------- myyy namee isss amitttt-->  m nam i ami


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


