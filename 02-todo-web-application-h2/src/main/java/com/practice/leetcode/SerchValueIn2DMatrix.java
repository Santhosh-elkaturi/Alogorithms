package com.practice.leetcode;

public class SerchValueIn2DMatrix {

	public static boolean searchMatrixSolution2(int[][] matrix, int key) {

		int n = matrix.length;// rows length
		int m = matrix[0].length;// columns length
		int lo = 0;
		int hi = (n * m) - 1;
		
		while(lo<=hi) {
		int mid = (lo + hi) / 2;
		int r = mid / m;
		int c = mid % m;
			if (matrix[r][c] > key) {
				hi = mid - 1;
			} else if (matrix[r][c] < key) {
				lo = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	public static boolean searchMatrixSolution1(int[][] matrix, int k) {

		int n = matrix.length;// row
		int m = matrix[0].length;// column
		int r = 0;
		int c = m - 1;
		while (r < n && c >= 0) {
			if (matrix[r][c] < k) {
				r++;
			} else if (matrix[r][c] > k) {
				c--;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean result1 = searchMatrixSolution1(matrix, target);// N+M complexity
		boolean result2 = searchMatrixSolution2(matrix, target);// logN+logM complexity
		System.out.println(result1);
		System.out.println(result2);
	}

}
