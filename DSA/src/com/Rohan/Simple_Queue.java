package com.Rohan;

import java.util.LinkedList;
import java.util.Queue;


public class Simple_Queue {

public static void main(String[] args) {
		
		Queue<String> names = new LinkedList<String>();
		
		names.add("Roni");
		names.add("VIKKI");
		names.add("Tushi");
		names.add("YUVI");
		names.add("Rtvy");
			
		System.out.println(names);
		System.out.println(names.peek());

	}

}
