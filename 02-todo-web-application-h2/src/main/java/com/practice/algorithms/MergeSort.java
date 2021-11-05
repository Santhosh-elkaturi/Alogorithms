package com.practice.algorithms;

public class MergeSort {
	
	 
    void merge(int arr[], int start, int mid, int end)
    {
    	
    	int[] tempArry = new int[end-start + 1];
    	int leftStart = start;
    	int rightStart = mid+1;
    	int k = 0 ;
    	
    	while(leftStart<=mid && rightStart<=end) {
    		
    		if(arr[leftStart] < arr[rightStart]) {
    			tempArry[k] = arr[leftStart];
    			leftStart  = leftStart + 1;
    		}else {
    			tempArry[k] = arr[rightStart];
    			rightStart = rightStart + 1;
    		}
    		k = k+1 ;
    	}
    	
    	if(leftStart<=mid) {
    		while(leftStart<=mid) {
    			tempArry[k] = arr[leftStart];
    			leftStart++;
    			k++;
    		}
    	}else if(rightStart<=end) {
    		while(rightStart<=end) {
    			tempArry[k] = arr[rightStart];
    			rightStart++;
    			k++;
    		}
    	}
    	for (int i = 0; i < tempArry.length; i++) {
			arr[start + i] = tempArry[i];
		}
    	
    	
     }
 
    
  
    void sort(int arr[], int start, int end)
    {
    	
        if (end <= start) {
        	return;
        }
            
            int mid = (start+end)/2;
            
            sort(arr, start, mid);
           
            sort(arr, mid + 1, end);
 
         
            merge(arr, start, mid, end);
        }
    
 
 
    // Driver code
    public static void main(String args[])
    {
        int inputArr[] = { 7,18,12, 11, 13, 5, 4};
 
        System.out.println("Given Array");
        
      
 
       MergeSort ob = new MergeSort();
       ob.sort(inputArr, 0, inputArr.length - 1);
       for (int i = 0; i < inputArr.length; i++) {
    	   System.out.println(inputArr[i]);
		
	}
 
  
    }
}