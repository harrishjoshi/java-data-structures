package com.harxsh;

import java.util.Arrays;
import java.util.List;

public class _Arrays {
    public static void main(String[] args) {
        String[] colors = new String[5];

        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "black";

        // print out the array colors in reverse order
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println("\n");

        Arrays.stream(colors).forEach(System.out::println);

        System.out.println("\n");

        List.of("red", "blue", "black").forEach(System.out::println);
    }
}
