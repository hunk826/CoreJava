package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        // create a TreeSet with a custom comparator that defines a reverse order
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        // add some elements to the set
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(9);

        // print the elements in descending order
        System.out.println("Elements in descending order:"+set);
        
    }
}
