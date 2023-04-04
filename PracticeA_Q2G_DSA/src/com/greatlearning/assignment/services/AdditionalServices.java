package com.greatlearning.assignment.services;

public class AdditionalServices {

	//1. Print the stock prices in ascending orders
	public static void displayPriceAscendingOrder(double[] array) {
		
		System.out.println("Stock prices in ascending orders are: ");
		
		for(int i =0; i< array.length; i++) {
			System.out.print(array[i]+ " ");
			System.out.println();
		}
	}
	
	//1. Print the stock prices in decending orders
		public static void displayPricedecendingOrder(double[] array) {
			
			System.out.println("Stock prices in decending orders are: ");
			
			for(int i=  array.length - 1;i >= 0; i--) {
				System.out.print(array[i]+ " ");
				System.out.println();
			}
		}
}
