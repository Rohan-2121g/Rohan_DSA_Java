package com.Rohan;

import java.util.ArrayList;
import java.util.Collections;

public class TASK_12_reverse_Array {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Vikku");
        students.add("RTVY");
        students.add("Rohan");
        students.add("Jaisu");
        students.add("Yuvi");

        System.out.println("Original List:");
        System.out.println(students);

        Collections.reverse(students);

        System.out.println("Reversed List:");
        System.out.println(students); 
    }
}
