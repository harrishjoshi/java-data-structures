package com.harxsh;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class _Set {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball( "red"));
        balls.add(new Ball( "blue"));
        balls.add(new Ball( "pink"));
        balls.add(new Ball( "red"));

        balls.remove(new Ball( "pink"));
        System.out.println(balls);
        balls.forEach(System.out::println);
    }

    static class Ball {
        private final String color;

        public Ball(String color) {
            this.color = color;
        }

        // if we don't override hashCode and equals, it compares the reference of the object
        // if we override hashCode and equals, it compares the value of the object  (color)

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball [color=" + color + "]";
        }
    }

    // record Ball(String color) {}
}
