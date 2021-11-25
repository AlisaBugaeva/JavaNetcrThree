package com.mycompany.tests;

import com.mycompany.circle.Circle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("Array List ");
        ArrayList<Circle> circleArrayList = new ArrayList<>();
        long lStartTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            circleArrayList.add(new Circle(i+1));
        }

        long lEndTime = System.nanoTime();

        long output = lEndTime - lStartTime;

        System.out.println("AddTime: " + output );


        lStartTime = System.nanoTime();

        System.out.println(circleArrayList.get(2));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("GetTime: " + output );


        lStartTime = System.nanoTime();

        System.out.println(circleArrayList.remove(4));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("RemoveTime: " + output );


        lStartTime = System.nanoTime();

        circleArrayList.add(1,new Circle(2005));

        lEndTime = System.nanoTime();

        output = lEndTime - lStartTime;

        System.out.println("AddByIndexTime: " + output );


    }
}
