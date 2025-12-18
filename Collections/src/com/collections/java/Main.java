package com.collections.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Apple");
//        list.add("Banana");
//        list.add("Cherry");
//
//        System.out.println("Fruits in the list:");
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }
//        list.remove("Apple");
//        list.get(0);

        Map<String ,String> map = new HashMap<>();

        map.put("Name", "John");
        map.put("Age" , "30");
        map.put("City", "New York");
        System.out.println("Person Details:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }


    }
}
