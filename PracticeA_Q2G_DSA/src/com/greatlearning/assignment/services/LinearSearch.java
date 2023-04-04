package com.greatlearning.assignment.services;

public class LinearSearch {

	public static int countCompaniesInProfit(boolean array[]){
		
		int count = 0;
		
		//1. run the for loop for till the length of the array
		for(int i =0; i< array.length; i++) {
			
			//2.Check the condition and increment the count variable
			if(array[i] == true)
				count++;
		}
		//3. return the value if count
		return count;
	}
}
