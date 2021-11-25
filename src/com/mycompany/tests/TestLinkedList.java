package com.mycompany.tests;

import com.mycompany.circle.Circle;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("Linked List ");
        LinkedList<Circle> circleLinkedList = new LinkedList<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            circleLinkedList.add(new Circle(i+1));
        }

       long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output );


        lStartTime = System.nanoTime();

        System.out.println(circleLinkedList.get(100));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output );


        lStartTime = System.nanoTime();

        System.out.println(circleLinkedList.remove(150));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output );


        lStartTime = System.nanoTime();

        circleLinkedList.add(1,new Circle(2005));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("AddByIndexTime: " + output );


    }

}
