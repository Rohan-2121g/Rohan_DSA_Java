package com.Rohan;


import java.util.ArrayList;
import java.util.Collections;

public class TASK_13_Ascending_Dscending {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();
        students.add("Rohan");
        students.add("RTVY");
        students.add("Vikku");
        students.add("Jaisu");
        students.add("Yuvi");

        System.out.println("Original List of Students:");
        System.out.println(students);

        
        Collections.sort(students);
        System.out.println("Students in Ascending Order:");
        System.out.println(students);

        
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("Students in Descending Order:");
        System.out.println(students);
    }
}