package com.mycompany.tests;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        System.out.println("HashMap");
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            integerStringHashMap.put(i, "a");
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringHashMap.get(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringHashMap.remove(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output);
    }
}
