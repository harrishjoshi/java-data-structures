package com.harxsh;

import java.util.LinkedList;
import java.util.Queue;

public class _Queue {
    public static void main(String[] args) {
        queue();
    }

    private static void queue() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Harish", 25));
        supermarket.add(new Person("Alex", 20));
        supermarket.add(new Person("John", 30));

        System.out.println(supermarket);
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket);
    }

    static record Person(String name, int age){}
}
