package com.harxsh;

import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList {
    public static void main(String[] args) {
        linkedList();
    }

    private static void linkedList() {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Harish", 25));
        linkedList.add(new Person("Alex", 20));
        linkedList.addFirst(new Person("John", 30));

        ListIterator<Person> personLPersonIterator = linkedList.listIterator();

        while (personLPersonIterator.hasNext()) {
            System.out.println(personLPersonIterator.next());
        }

        System.out.println("===========================");
        while (personLPersonIterator.hasPrevious()) {
            System.out.println(personLPersonIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
