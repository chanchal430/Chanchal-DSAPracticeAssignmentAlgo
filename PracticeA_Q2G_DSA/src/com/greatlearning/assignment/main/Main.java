package com.greatlearning.assignment.main;


import java.util.Scanner;

import com.greatlearning.assignment.services.AdditionalServices;
import com.greatlearning.assignment.services.BinarySearchImplementation;
import com.greatlearning.assignment.services.LinearSearch;
import com.greatlearning.assignment.services.MergeSortImplementation;

public class Main {

	public static void main(String[] args) {
		
     //1. Declare all the required variables
		
		int noOfCompanies;
		int option;
		
	//2. Find the total no of companies that are associated with stocker's
		
		System.out.println("Enter the no of companies that are associated with stocker's");
		Scanner sc = new Scanner(System.in);
		noOfCompanies = sc.nextInt();
		
		
	//3. Declare and initialize the required array's
		 
		 double priceArray[] = new double[noOfCompanies];
		 boolean profitArray[] = new boolean[noOfCompanies];
		 
	 //4. Take today's stock prices for all companies from the user and also check if the 
	 //   stock price rose or fallen
		 
		 for(int i = 0; i < noOfCompanies; i++) {
			 
			 System.out.println("Enter Current Stock price of the company "+ (i +1));
			 priceArray[i] = sc.nextDouble();
			 
			 System.out.println("Whether company's stock price rose today compare to yesterday? ");
			 profitArray[i] = sc.nextBoolean();
		 }
     //5. Sort the input value. (Do not leave the profitArray)
		 
		 MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		 mergeSortImplementation.sort(profitArray, priceArray, 0, priceArray.length - 1);
		 
		 AdditionalServices additionalServices = new AdditionalServices();
		 LinearSearch linearSearch = new LinearSearch();
		 
		 BinarySearchImplementation binarySearchImplementation = new BinarySearchImplementation();
		 
		 
	 //6. Take user input for various operations
		 
		 do {
			 System.out.println("\n-----------------------------------------");
			 System.out.println("Enter the operation that you want to perform ");
			 System.out.println("1. Display the companies stock prices in ascending order");
			 System.out.println("2. Display the companies stock prices in decending order ");
			 System.out.println("3. Display the total no of companies for which stock prices rose today ");
			 System.out.println("4. Display the  total no of companies for which stock prices declined today");
			 System.out.println("5. Search a specific stock price ");
			 System.out.println("6. press 0 to exit ");
			 System.out.println("\n-----------------------------------------");
			 
			 option = sc.nextInt();
			 
	 //7. Perform the appropriated opperation
			 switch(option) {
			 
			 case 0 :
				 option = 0;
				 break;
			 
			 case 1 :
				 AdditionalServices.displayPriceAscendingOrder(priceArray);
				 break;
				 
			 case 2 :
				 AdditionalServices.displayPricedecendingOrder(priceArray);
				 break;
				 
			 case 3 :
				 System.out.println("Total no of companies whose stock price rose today: "
						  + LinearSearch.countCompaniesInProfit(profitArray));
				 break;
				 
			 case 4 :
				 System.out.println("Total no of companies whose stock price decline today: "
						  + (noOfCompanies - LinearSearch.countCompaniesInProfit(profitArray)));
				 break;
				 
			 case 5 :
                  double key;
                  System.out.println("Enter the key value ");
                  key = sc.nextDouble();
                  BinarySearchImplementation.searchValue(priceArray, key);
                  break;
                  
              default: 
            	   System.out.println("Enter Valid option!");
			 }
		 }while(option != 0);
		 
	//8. Print exit message and close the scanner object
		 System.out.println("Exited Successfully!");
		 sc.close();
	}

}
