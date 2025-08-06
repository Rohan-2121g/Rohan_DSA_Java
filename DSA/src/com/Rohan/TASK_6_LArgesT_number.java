package com.Rohan;

public class TASK_6_LArgesT_number {
 
	
	public static void main(String[] args) {
		 int[] arr = {10, 50, 69, 40, 20};

	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Largest number "+" "+ max);
	    }
	
	
	
}
