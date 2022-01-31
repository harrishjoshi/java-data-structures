package com.harxsh;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _Map {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Tom"), new Diamond("Diamond 1"));

        System.out.println(new Person("Tom").hashCode());
        System.out.println(new Person("Tom").hashCode());
        System.out.println(map.get(new Person("Tom")));
    }

    private static void map() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Tom"));
        map.put(2, new Person("Jerry"));
        map.put(3, new Person("Bob"));
        map.put(3, new Person("Bob New"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        map.remove(3);
        map.remove(4);
        map.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    // record Person(String name) {}

    record Diamond(String name) {}

    class Person2 {
        private final String name;
        private final int age;

        Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person2 person2 = (Person2) o;
            return age == person2.age && Objects.equals(name, person2.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person2{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
