package com.harxsh;

import java.util.Stack;

public class _Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(2));
        System.out.println(stack.search(4));
    }
}
