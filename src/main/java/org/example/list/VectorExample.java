package org.example.list;

import java.util.*;

/*
Vector is synchronized, which means only one thread at a time can access the code, while ArrayList is not synchronized, which means multiple threads can work on ArrayList at the same time.

 */

public class VectorExample {
    public static void main(String[] args)
    {

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the Vector
        // after deletion
        System.out.println(v);
        Iterator<Integer> vitr = v.iterator();

        while(vitr.hasNext()) {
            System.out.println(vitr.next());
        }
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
