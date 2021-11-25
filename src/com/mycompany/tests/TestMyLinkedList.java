package com.mycompany.tests;

import com.mycompany.circle.Circle;
import com.mycompany.list.MyLinkedList;


public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("My Linked List ");
        MyLinkedList<Circle> circleMyLinkedList = new MyLinkedList<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            circleMyLinkedList.add(new Circle(i+1));
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output );

        lStartTime = System.nanoTime();

        System.out.println(circleMyLinkedList.get(100));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output );


        lStartTime = System.nanoTime();

        System.out.println(circleMyLinkedList.remove(150));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output );


        lStartTime = System.nanoTime();

        circleMyLinkedList.add(1,new Circle(2005));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("AddByIndexTime: " + output );


        /*for (Circle s: circleMyLinkedList ) {
            System.out.print(s + " ");
        }

        System.out.println(" ");

        System.out.println(circleMyLinkedList.get(1));
        System.out.println(circleMyLinkedList.get(4));*/

    }

}
