package com.mycompany.tests;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        System.out.println("TreeSet");
        TreeSet<Integer> intTreeSet = new TreeSet<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 5; i++) {
            intTreeSet.add(i);
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(intTreeSet.remove(5));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output);


        // Мы не можем вставить элемент в определенный индекс.

        System.out.println("AddByIndexTime: невозможно");
    }
}
