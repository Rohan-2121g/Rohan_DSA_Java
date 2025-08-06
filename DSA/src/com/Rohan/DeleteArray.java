package com.Rohan;


public class DeleteArray {
	
	public static void main(String[] args) {
		int[] numbers = {11,22,33,44};
		int deleteNumber = 2;
		
		for(int i=deleteNumber;i<numbers.length-1;i++) {
			numbers[i] = numbers[i+1];
		}
		
		for(int i=0; i<numbers.length-1;i++) {
			System.out.println(numbers[i]);
		}
	}
}