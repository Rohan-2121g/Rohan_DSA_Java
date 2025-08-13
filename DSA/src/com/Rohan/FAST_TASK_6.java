package com.Rohan;

import java.util.ArrayList;

public class FAST_TASK_6 {

	    public static void main(String[] args) {
	        ArrayList<String> cities = new ArrayList<>(); // create an ArrayList to store city names
	        cities.add("Leaf");                         // add city to the list
	        cities.add("Sand");
	        cities.add("Fire");
	        cities.add("Mist");

	        cities.add(2, "Konoha");                         // insert "Konoha" at index 2 (third position)
	        System.out.println(cities);                    // print the updated list
	    }
	}

