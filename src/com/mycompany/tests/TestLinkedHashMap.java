package com.mycompany.tests;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        System.out.println("LinkedHashMap");
        LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            integerStringLinkedHashMap.put(i, "a");
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringLinkedHashMap.get(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(integerStringLinkedHashMap.remove(15));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output);
    }
}
