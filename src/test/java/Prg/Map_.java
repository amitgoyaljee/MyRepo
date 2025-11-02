package Prg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  Map_ {

    @Test
    public void HashMapPrg() {
        {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
            System.out.println("Size of map is:- "
                    + map.size());

            if (map.containsKey("vishal")) {
                Integer a = map.get("vishal");
                System.out.println("value for key"
                        + " \"vishal\" is: " + a);
            }

            System.out.println("111111111111111111/////////////////");
            System.out.println(map);

            System.out.println("222222222222222222222222///////////");

            for (Map.Entry<String, Integer> en : map.entrySet()) {
                System.out.println(en.getKey());
                System.out.println(en.getValue());
            }

            System.out.println("3333333333///////////");

            Iterator itr = map.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<String, Integer> en = ( Map.Entry) itr.next();
                System.out.println(en.getKey());
                System.out.println(en.getValue());
            }

            System.out.println("444444444///////////");

            map.entrySet().forEach(x -> System.out.println(x));
            System.out.println("///////////");
            map.keySet().forEach(x -> System.out.println(x));

            System.out.println("5555555555///////////");

            map.forEach((x, y) -> System.out.println(x + "" + y));
            map.forEach((x, y) -> System.out.println(x ));
            map.forEach((x, y) -> System.out.println( y));
        }
    }
    @org.junit.Test
    public void my1() {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("abc", 12);
        hm.put("abxc", 134);
        hm.put("ac", 14);
        hm.put("abxc", 234);
        hm.put("abzc", 1234);
        hm.entrySet().stream().filter(x->x.getValue()>12).filter(x->x.getKey().equals("ac")).forEach(x->System.out.println(x));
    }

    @Test
    public void HashMapSort() {
        {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
            System.out.println(map);
            System.out.println("Sorting by keys");
            map.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                    .forEach(System.out::println);
            map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println(x));
            System.out.println("Sorting by Values");
            map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(x -> System.out.println(x));
        }
    }

    @Test
    public void HashMapSortUsingList() {
        {
            System.out.println("Sorting by List");
            HashMap<String, Integer> map = new HashMap<>();
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
            System.out.println("original---" + map);

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(
                    list,
                    (i1,
                     i2) -> i1.getValue().compareTo(i2.getValue()));
            System.out.println("after sort" + list);

        }
    }

    @Test
    public void characterOccur() {
        String str = "aaabbbbcccddd";
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch2 : ch) {
            if (!map.containsKey(ch2)) {
                map.put(ch2, 1);
            } else {
                map.put(ch2, map.get(ch2) + 1);
            }
        }
        map.forEach((x, y) -> System.out.println(x + "" + y));
        map.entrySet().forEach((x) -> System.out.println(x));
        System.out.println(map);
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry en = (Map.Entry) itr.next();
            System.out.println(en.getKey() + "" + en.getValue());
        }
        for (Entry en : map.entrySet()) {
            System.out.println(en.getValue() + "" + en.getKey());
        }
    }

    @Test
    public void wordOccur() {
        String str = "aaa bbbb ccc ddd aaaa bbb aaa";
        String str1[] = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String str2 : str1) {
            if (!map.containsKey(str2)) {
                map.put(str2, 1);
            } else {
                map.put(str2, map.get(str2) + 1);
            }
        }
        map.forEach((x, y) -> System.out.println(x + "" + y));
       // map.forEach(x -> System.out.println(x );//types in lambda expression: wrong number of parameters: expected 2 but found 1
    }


    @Test
    public void HashMapCompare() {
        {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
            System.out.println(map);

            HashMap<String, Integer> map1 = new HashMap<>();
            map1.put("vishal", 10);
            map1.put("sachin", 30);
            map1.put("vaibhav", 20);
            System.out.println(map1);

            HashSet<String> set = new HashSet<String>(map.keySet());
            HashSet<String> set2 = new HashSet<String>(map1.keySet());
            System.out.println(set.equals(set2));

            HashSet<Integer> set3 = new HashSet<Integer>(map.values());
            HashSet<Integer> set4 = new HashSet<Integer>(map1.values());
            System.out.println(set3.equals(set4));
        }
    }

    @Test
    public void wordHaving2_Occur() {
        String str = " bbbb ccc ddd aaaa bbb aaa ddd ccc";
        String str1[] = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String str2 : str1) {
            if (!map.containsKey(str2)) {
                map.put(str2, 1);
            } else {
                map.put(str2, map.get(str2) + 1);
            }
        }
        map.entrySet().stream().filter(x -> x.getValue().equals(2)).forEach(x -> System.out.println(x));
        //or
        map.entrySet().stream().filter(x -> x.getValue()==2).forEach(x -> System.out.println(x));

    List<String> list=map.keySet().stream().filter(x ->x.contains("aaa")).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void HashMapContains() {
        {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("vishal", 10);
            map.put("sachin", 30);
            map.put("vaibhav", 20);
            System.out.println(map);
            System.out.println(map.containsKey("vishal"));
            System.out.println(map.containsValue(10));
        }
    }

    @Test
    public void HashMapMerge() {
        HashMap<String, Integer> prices = new HashMap<>();
        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        HashMap<String, Integer> prices22 = new HashMap<>();
        // insert entries to the HashMap
        prices22.put("Shoes22", 200);
        prices22.put("Bag22", 300);
        prices22.put("Pant22", 150);

        prices.putAll(prices22);
        System.out.println("putAll----------"+prices);

        int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt: " + returnedValue);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);
    }


    @Test
    public void waitsss(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
////////////Explicit
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

////////////Fluient
        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))          // Max wait time
                .pollingEvery(Duration.ofSeconds(2))          // Poll every 2 sec
                .ignoring(NoSuchElementException.class);      // Ignore if not found

        WebElement element1 = wait1.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("myElement1"));
            }
        });
//✅ Lambda Version (Simpler)

        WebElement element2 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .until(d -> d.findElement(By.id("myElement2")));

    }
}

