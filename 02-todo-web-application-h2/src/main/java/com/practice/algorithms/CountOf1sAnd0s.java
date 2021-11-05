package com.practice.algorithms;

public class CountOf1sAnd0s {
	public static void main(String[] args) {
		int[] values = {1,0,1,0,1,0,0,0,0,0,1};
		int sum = findcountof1and0(0,values,values.length);
		System.out.println("count of one s "+sum+" zero's "+(values.length-sum));
	}

	private static int findcountof1and0(int i, int[] values, int length) {
		
		int sum = 0;
		for (int j = 0; j < values.length; j++) {
			sum = sum+values[j];
		}
		return sum;
	}
}
