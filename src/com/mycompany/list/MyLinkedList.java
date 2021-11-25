package com.mycompany.list;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {


    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
    }

    @Override
    public Iterator<E> iterator() {
            return new Iterator<E>() {
                int counter=0;
                @Override
                public boolean hasNext() {
                    return counter<size;
                }

                @Override
                public E next() {
                    return get(counter++);
                }
            };
        }


    private static class Node<E> {
        E element;
        Node<E> nextNode;
        Node<E> prevNode;

        Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.nextNode = next;
            this.prevNode = prev;
        }
    }

    /*public Node<E> getFirst() {
        return first;
    }

    public E getLast() {
        return last.element;
    }*/

    @Override
    public void add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.nextNode = newNode;
        size++;

    }

    @Override
    public void add(int index, E element) {
        if (index >= 0 && index < size) {
            Node<E> nodeByIndex = first;
            for (int i = 0; i < index - 1; i++) {
                nodeByIndex = nodeByIndex.nextNode;
            }
            Node<E> nextByIndex = nodeByIndex.nextNode;
            Node<E> l = nodeByIndex;
            Node<E> newNode = new Node<>(l, element, nextByIndex);
            //nodeByIndex = newNode;
            l.nextNode = newNode;
            nextByIndex.prevNode = newNode;
            size++;

        } else if (size == index) {
            add(element);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public void clear() {
        Node<E> x = first;
        while (x != null) {
            Node<E> next = x.nextNode;
            x.element = null;
            x.nextNode = null;
            x.prevNode = null;
            x = next;
        }
        first = last = null;
        size = 0;


    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            if(index<=size/2) {
                Node<E> nodeByIndex = first;
                for (int i = 0; i < index; i++) {
                    nodeByIndex = nodeByIndex.nextNode;
                }
                return nodeByIndex.element;
            }
            else {
                Node<E> nodeByIndex = last;
                for (int i = size-1; i > index; i--) {
                    nodeByIndex = nodeByIndex.prevNode;
                }
                return nodeByIndex.element;
            }
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public int indexOf(E element) {
        int index=0;
        for (Node<E> x = first; x != null; x = x.nextNode) {
            if (element.equals(x.element))
                return index;
            index++;
        }

        return -1;
    }


    @Override
    public E remove(int index) {
        if (index >= 0 && index < size-1) {
            Node<E> nodeByIndex = first;
            for (int i = 0; i < index ; i++) {
                nodeByIndex = nodeByIndex.nextNode;
            }
            Node<E> nextByIndex = nodeByIndex.nextNode;
            Node<E> prevByIndex = nodeByIndex.prevNode;
            prevByIndex.nextNode = nextByIndex;
            nextByIndex.prevNode =prevByIndex;
            size--;
            return nodeByIndex.element;

        } else if (index==size-1) {
            Node<E> nodeByIndex = last;
            Node<E> prevByIndex = nodeByIndex.prevNode;
            prevByIndex.nextNode=null;
            last=prevByIndex;

            return nodeByIndex.element;

        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public E set(int index, E element) {
        if (index >= 0 && index < size) {
            Node<E> nodeByIndex = first;
            for (int i = 0; i < index ; i++) {
                nodeByIndex = nodeByIndex.nextNode;
            }
            E oldNodeByIndex=nodeByIndex.element;
            nodeByIndex.element=element;
            return oldNodeByIndex;

        }
        else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
       Object[] array = new Object[size];
        Node<E> nodeByIndex = first;
        for (int i=0;i<size;i++) {
            array[i] =nodeByIndex.element;
            nodeByIndex = nodeByIndex.nextNode;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            Class c = a.getClass().getComponentType();
            a = (T[]) Array.newInstance(c, size);
        }
        Object[] array = a;
        Node<E> nodeByIndex = first;
        for (int i=0;i<size;i++) {
            array[i] =nodeByIndex.element;
            nodeByIndex = nodeByIndex.nextNode;
        }

        if (a.length > size)
            a[size] = null;

        return a;
    }


    @Override
    public String toString() {

        String b =" ";
        Node<E> nodeByIndex = first;
        for (int i=0;i<size;i++) {
            b= b+ nodeByIndex.element.toString()+" ";
            nodeByIndex = nodeByIndex.nextNode;
        }

        return "MyLinkedList{" +
                "size=" + size +
                ", elements:" + b +
                '}';
    }




}
