package com.Rohan;

import java.util.*;

public class FAST_TASK_4 {
    public static void main(String[] args) {

        // create a stack of integer type
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i); // adds the current value of 'i' to the top of the stack
        }

        System.out.println("Stack: " + stack);
    }
}
