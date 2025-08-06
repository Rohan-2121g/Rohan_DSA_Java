package com.Rohan;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSorting {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(49);
		numbers.add(10);
		numbers.add(8);
		numbers.add(69);
		numbers.add(42);
		
		System.out.println("Before Sorting: " + numbers);
		Collections.sort(numbers);
		System.out.println("After sorting in ascending order: " + numbers);
		Collections.reverse(numbers);
		System.out.println("After sorting in descending order: " + numbers);
	}
}