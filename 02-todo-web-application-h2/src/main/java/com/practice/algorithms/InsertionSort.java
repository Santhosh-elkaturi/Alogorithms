package com.practice.algorithms;

public class InsertionSort {
	
	public static void insertionSort(int array[]) {  
       int n = array.length;
		for (int i = 1; i < n; i++) {
			int element = array[i];
			int j = i-1;
			while((j>=0) && (array[j]> element)){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = element;
		}
    }  
       

	public static void main(String[] args) {
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : arr1) {
			System.out.print(i + " ");
		}

		insertionSort(arr1);// so
		
		System.out.println(" ");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
