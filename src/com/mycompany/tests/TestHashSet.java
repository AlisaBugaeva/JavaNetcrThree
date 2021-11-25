package com.mycompany.tests;

import com.mycompany.circle.Circle;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        System.out.println("HashSet");
        HashSet<Integer> intHashSet = new HashSet<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            intHashSet.add(i);
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(intHashSet.remove(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output );


        //Одним из аспектов стандарта HashSet<T> является то, что он неупорядочен . Таким образом, мы не можем вставить элемент в определенный индекс.

        System.out.println("AddByIndexTime: невозможно" );




    }
}
