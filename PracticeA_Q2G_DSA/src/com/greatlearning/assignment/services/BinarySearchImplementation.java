package com.greatlearning.assignment.services;

public class BinarySearchImplementation {

	public static void searchValue(double priceArray[], double key) {
		
	//1. Declare and initialize the the required variables
		int left = 0;
		int right = priceArray.length - 1;
		int mid = left + (right - left) / 2;
		
	//2. Repeat the loop until left index value is less or equal to the right index value
		
		while(left <= right) {
			if(key < priceArray[mid]) {
				//range is l to mid -1
				right = mid -1;
			}else if(key > priceArray[mid]){
				//range is mid +1 to right
				left = mid + 1;
			}else {
				System.out.println("Stock of value "+ key+ " is present ");
				break;
			}
			mid= left + (right - left)/2;
		}
		if(left > right) {
			System.out.println("Value not found");
		}
	}
}
