package com.mycompany;

import com.mycompany.list.MyLinkedList;


public class Main {
    public static void main(String[] args){
        MyLinkedList<String> stringMyLinkedList= new MyLinkedList<>();

        stringMyLinkedList.add("a");
        stringMyLinkedList.add("b");
        stringMyLinkedList.add("c");
        System.out.println(stringMyLinkedList.get(2));
        stringMyLinkedList.add(1,"d");
        System.out.println(stringMyLinkedList.get(0));
        stringMyLinkedList.clear();
        System.out.println(stringMyLinkedList.get(0));
        System.out.println(stringMyLinkedList.indexOf("c"));
        System.out.println(stringMyLinkedList.size());
        System.out.println(stringMyLinkedList.remove(1));
        System.out.println(stringMyLinkedList.get(1));
        System.out.println(stringMyLinkedList.set(1,"bb"));
        System.out.println(stringMyLinkedList.get(1));
        Object[] mas =  stringMyLinkedList.toArray();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");
        System.out.println(stringMyLinkedList.set(1,"b"));
        stringMyLinkedList.toArray(mas);
        for (int i = 0; i < stringMyLinkedList.size(); i++) {
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");
        System.out.println(stringMyLinkedList.toString());
        System.out.println(stringMyLinkedList.size());
        for (String s: stringMyLinkedList ) {
            System.out.print(s+" ");

        }



    }
}
