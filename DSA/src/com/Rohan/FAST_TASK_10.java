package com.Rohan;

import java.util.ArrayList;

public class FAST_TASK_10 {
    public static void main(String[] args) {
        ArrayList<String> mobiles_brand = new ArrayList<>();  // create an ArrayList for mobile brands
        mobiles_brand.add("Realme");                         // add brands to the list
        mobiles_brand.add("Nothing");
        mobiles_brand.add("OnePlus");

        mobiles_brand.add(1, "Apple");                       // insert "Apple" at index 1 (middle)
        System.out.println(mobiles_brand);                    // print the updated list
    }
}