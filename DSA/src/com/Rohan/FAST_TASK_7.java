package com.Rohan;

import java.util.Vector;

public class FAST_TASK_7 {

	public static void main(String[] args) {
        Vector<String> books = new Vector<>();         // create a vector to store book names
        books.add("NARUTO");                    // add books to the vector
        books.add("NARUTO TIMESKIP");
        books.add("NARUTO SHIPUDEN");

        books.add(0, "BORUTO");         // insert at beginning (index 0)
        System.out.println(books);                     // print the updated vector
    }
}

