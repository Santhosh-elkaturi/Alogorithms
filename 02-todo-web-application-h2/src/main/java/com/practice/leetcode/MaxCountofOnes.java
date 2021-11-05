package com.practice.leetcode;

public class MaxCountofOnes {
	
	public static int findMaxCountOfOnes(int[][] matrix) {
		
		int n =matrix.length;
		int m = matrix[0].length;
		int r = 0;
		int c = m-1;
		int count = 0;
		int max = 0;
		int row = -1;
		while(r<n && c>=0) {
			if(matrix[r][c]==1) {
				count++;
				c--;
			}else {
				r++;
			}
			if(count>max) {
				max = count;
				row = r;
			}
		}
		System.out.println(row);
		return count;
	}
	
	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 0, 0, 1, 1, 1 }, 
						   { 0, 0, 0, 1, 1, 1, 1 }, 
						   { 0, 0, 0, 0, 0, 0, 1 },
						   { 0, 0, 0, 0, 0, 0, 0 },
						   { 0, 0, 1, 1, 1, 1, 1 },
						   { 0, 0, 0, 0, 0, 0, 1 }
						 };
		
		int maxCount = findMaxCountOfOnes(matrix);
		System.out.println(maxCount);

	}

	
}
