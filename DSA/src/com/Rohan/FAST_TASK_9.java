package com.Rohan;

import java.util.Stack;

public class FAST_TASK_9 {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();         // create a Stack to store integers
        num.push(11);                               // Push numbers onto the stack
        num.push(22);
        num.push(33);

        num.push(44);                               // push one more number on top
        System.out.println(num);                    // print the stack
    }
}