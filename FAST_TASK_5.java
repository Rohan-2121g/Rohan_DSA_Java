package com.Rohan;

import java.util.*; 

public class FAST_TASK_5 {

	public static void main(String[] args) { 

        // creates a new stack that stores strings
        Stack<String> stack = new Stack<>();

        stack.push("ORANGE");     
        stack.push("BERRY");   
        stack.push("GRAPES");    

        // pops the top element off the stack and prints it
        String top = stack.pop(); 
        System.out.println("Popped: " + top);

        // check the current top element without removing it
        System.out.println("Top now: " + stack.peek()); 

        System.out.println("Final Stack: " + stack); 
    }

}
