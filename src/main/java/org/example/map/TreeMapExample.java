package org.example.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);

        // Iterating through the map in sorted order
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
