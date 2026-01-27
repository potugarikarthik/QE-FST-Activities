package com.example;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

  
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Karthik");
        myList.add("House");
        myList.add("Bruce");
        myList.add("");
        myList.add("Priya");

       
        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

       
        System.out.println("\n3rd name in the list: " + myList.get(2));

        String checkName = "Rahul";
        if (myList.contains(checkName)) {
            System.out.println("\n" + checkName + " exists in the list.");
        } else {
            System.out.println("\n" + checkName + " does not exist in the list.");
        }

        System.out.println("\nNumber of names in the list: " + myList.size());

 
        myList.remove("Suresh");

   
        System.out.println("Size after removal: " + myList.size());
    }
}
