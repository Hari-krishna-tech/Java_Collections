package org.example.set;

import java.util.*;

public class TreeSetDemo {
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
