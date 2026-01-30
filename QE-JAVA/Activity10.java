package com.example;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {

  
        HashSet<String> hs = new HashSet<>();


        hs.add("Java");
        hs.add("Python");
        hs.add("C");
        hs.add("C++");
        hs.add("JavaScript");
        hs.add("SQL");

     
        System.out.println("Size of HashSet: " + hs.size());

        hs.remove("C++");
        System.out.println("After removing C++: " + hs);

        
        boolean removed = hs.remove("Ruby");
        System.out.println("Trying to remove Ruby: " + removed);

        
        if (hs.contains("Java")) {
            System.out.println("Java is present in the set.");
        } else {
            System.out.println("Java is not present in the set.");
        }

        System.out.println("Updated HashSet: " + hs);
    }
}
