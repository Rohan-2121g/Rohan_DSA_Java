package com.Rohan;

public class SimpleSeearch {
	public static void main(String[] args) {
		int [] arr = {2,4,6,8,19};
		int key = 8;
		
		for (int i=0; i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("Number Found");
			}
		}
	}

}
