package com.example;
import java.util.HashMap;;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"red");
        colors.put(2,"black");
        colors.put(3,"white");
        colors.put(4,"yellow");
        colors.put(5,"green");

        System.out.println(colors);
        colors.remove(2);
        System.out.println("Hashmap after removing element"+colors);
        System.out.println(colors.containsValue("green"));
        System.out.println(colors.size());
    }

}
