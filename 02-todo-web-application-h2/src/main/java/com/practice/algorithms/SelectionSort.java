package com.practice.algorithms;

public class SelectionSort {
	
	private void sort(int[] inputArr) {
		
		for (int i = 0; i < inputArr.length; i++) {
			
			int minimum = i ;
			for (int j = i+1; j < inputArr.length; j++) {

				if(inputArr[j]<inputArr[i]) {
					minimum = j;
				}
				int temp = inputArr[i];
				inputArr[i] = inputArr[minimum];
				inputArr[minimum] = temp;
				
			}
		
			
		}
		
	}
	
	public static void main(String[] args) {
		int inputArr[] = { 7,18,12, 11, 13, 5, 4};
		 
        System.out.println("Given Array");
        
      
        SelectionSort ob = new SelectionSort();
       ob.sort(inputArr);
       for (int i = 0; i < inputArr.length; i++) {
    	   System.out.println(inputArr[i]);
	}
}
}

	
