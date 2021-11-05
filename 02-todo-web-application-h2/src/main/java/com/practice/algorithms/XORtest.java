package com.practice.algorithms;

public class XORtest {
	public static void main(String[] args) {
		
		int[] ar = {1,1,1,2,2,2,3,3,3,4,4,5,5,6,6,8,8,9,10,10,11,11,12,12};
		int num = findNonRepeatedNumber(ar);
		System.out.println(num);

	}

	public static int findNonRepeatedNumber(int[] ar) {
		int x  = ar[0]; 
		for (int i = 1; i < ar.length; i++) {
			x = x^ar[i];
		}
		// TODO Auto-generated method stub
		return x;
		
	}
}
