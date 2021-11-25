package com.mycompany.tests;

import com.mycompany.circle.Circle;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        System.out.println("LinkedHashSet");
        LinkedHashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 5; i++) {
            intLinkedHashSet.add(i);
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output);


        lStartTime = System.nanoTime();

        System.out.println(intLinkedHashSet.remove(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output );


        // LinkedHashSet поддерживает порядок вставки, поэтому все элементы добавляются в конец связанного списка. Но мы не можем вставить элемент в определенный индекс.

        System.out.println("AddByIndexTime: невозможно" );




    }
}

