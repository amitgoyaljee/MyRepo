package Prg;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class BBB {
    @Test
    public void my() {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("abc", 12);
        hm.put("abxc", 134);
        hm.put("ac", 14);
        hm.put("abxc", 234);
        hm.put("abzc", 1234);
        // hm.entrySet().stream().filter(x-> x.getValue()>234).forEach(x->System.out.print(x));
        hm.forEach((x, y) -> System.out.println(x + " " + y));
        hm.put("abcc", 134);
        hm.put("abvc", 14);
        hm.put("abfc", 234);
        hm.put("abec", 1234);
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println(x));
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(x -> System.out.println(x));

        ArrayList<Map.Entry<String, Integer>> ar = new ArrayList<>(hm.entrySet());
        Collections.sort(ar, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

        for (Map.Entry<String, Integer> en : hm.entrySet()) {
            if (en.getValue() > 234) {
                System.out.println(en.getKey());
            }
        }
        Iterator itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> en = (Map.Entry) itr.next();
        }

        Collections.sort(ar, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

//       for(Map.Entry<String,Integer> en:hm.entrySet()) {
        if (hm.containsKey("abec")) {
            int ii = hm.get("abec");
            System.out.println("value for key"
                    + " \"vishal\" is: " + ii);
            //   }

        }
        System.out.println(hm.entrySet().stream().filter(x-> x.getValue() == 1234).collect(Collectors.toList()));
    }

    @Test
    public void my1() {

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("abc", 12);
        hm.put("abxc", 134);
        hm.put("ac", 14);
        hm.put("abxc", 234);
        hm.put("abzc", 1234);
        hm.entrySet().stream().filter(x->x.getValue()>12).filter(x->x.getKey().equals("ac")).forEach(x->System.out.println(x));
    }
}
