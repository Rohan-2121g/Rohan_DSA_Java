package com.Rohan;

import java.util.Collections;
import java.util.LinkedList;


public class SIMPLE_LINKED_list {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		LinkedList<String> names = new LinkedList<String>();
		numbers.add(69);
		numbers.add(22);
		numbers.add(33);
		numbers.add(55);
		numbers.add(11);
		
		names.add("Rohan");
        names.add("RTVY");
        names.add("Vikku");
        names.add("Jaisu");
        names.add("Yuvi");
        
        Collections.sort(names);
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(names);
	}

}
