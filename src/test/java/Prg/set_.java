package Prg;

import org.testng.annotations.Test;

import java.util.*;

public class set_ {

    @Test
    public void SetToList() {
        Set<String> ss = new HashSet<String>();
        ss.add("amit");
        ss.add("bob");

        List<String> ls = new ArrayList<String>(ss);
        System.out.println(ls);

    }

    @Test
    public void ListToSet() {
        List<String> ls = new ArrayList<String>();
        ls.add("amit");
        ls.add("bob");
        Set<String> ss = new HashSet<String>(ls);
        System.out.println(ss);
    }

    @Test
    public void SortedSetOp() {
        SortedSet set = new TreeSet();
        // Add the elements in the given set.
        set.add("Audi");
        set.add("BMW");
        set.add("Mercedes");
        set.add("Baleno");
        System.out.println("The list of elements is given as:");
        for (Object object : set) {
            System.out.println(object);
        }
        //Returns the first element
        System.out.println("The first element is given as: " + set.first());
        //Returns the last element
        System.out.println("The last element is given as: " + set.last());


        //Returns a view of the portion of the given set whose elements are strictly less than the toElement.
        System.out.println("The respective element is given as: " + set.headSet("Baleno"));
        //Returns a view of the map whose keys are strictly less than the toKey.
        System.out.println("The respective element is given as: " + set.tailSet("Audi"));

    }
}