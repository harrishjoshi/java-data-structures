package com.harxsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _List {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors.size());
        System.out.println(colors.contains("pink"));
        System.out.println(colors.contains("red"));
        System.out.println(colors);

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        java.util.List<String> colorsUnModifiable = java.util.List.of("red", "green", "blue");
        // colorsUnModifiable.add("pink"); // UnsupportedOperationException

        java.util.List<String> colorsCopy = Arrays.asList("red", "green", "blue");
        // colorsCopy.add("pink"); // UnsupportedOperationException
        System.out.println("\n" + colorsCopy);
    }
}
