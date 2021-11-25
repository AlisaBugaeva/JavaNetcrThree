package com.mycompany.tests;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        System.out.println("TreeMap");
        TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            integerStringTreeMap.put(i, "a");
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringTreeMap.get(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringTreeMap.remove(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output);
    }
}
