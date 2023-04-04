package com.greatlearning.assignment.services;

public class MergeSortImplementation {

	
	public void merge(boolean profitArray[],double arr[],  int left, int mid, int right ) {
		//Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		/*Create temporary arrays*/
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];
		
		boolean leftProfitArray[] = new boolean[n1];
		boolean rightProfitArray[] = new boolean[n2];
		
	    /*Copy data to temporary array*/
		for(int i = 0; i < n1; i++) {
			leftArray[i] = arr[left + i];
			leftProfitArray[i] = profitArray[left + i];
		}
		for(int j = 0; j < n2; j++) {
			rightArray[j] = arr[mid + 1 + j];
			rightProfitArray[j] = profitArray[mid + 1 + j];
		}
		
		/*Merge the temporary arrays*/
		int i =0, j=0;
		
		/*Initial index of merged sub- arrays*/
		int k = left;
		while(i < n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				profitArray[k] = leftProfitArray[i];
				i++;
			}else {
				arr[k] = rightArray[j];
				profitArray[k] = rightProfitArray[j];
				j++;
			}
			k++;
		}
		
		/*Copy remaining element of L[] if any */
		while(i < n1) {
			arr[k] = leftArray[i];
			profitArray[k] = leftProfitArray[i];
			i++;
			k++;
		}
		
		/*Copy remaining element of R[] if any */
		while(j < n2) {
			arr[k] = rightArray[j];
			profitArray[k] = rightProfitArray[j];
			j++;
			k++;
		}
	}
    
    //Main function that sorts array [left to right] using merge()
	public void sort(boolean profitArray[], double[] arr, int left, int right) {
		if(left < right) {
			//find the mid point
			int mid= (left + right) /2;
			
		//sort first and second halves
			sort(profitArray, arr, left, mid);
			sort(profitArray, arr, mid + 1, right);
			
	   //merge the sprted halves
			merge(profitArray, arr, left, mid, right);
		}
		
	}

}
