package com.practice.algorithms;

import java.util.Scanner;

public class OpenAndCloseBrackets {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = new char[2*n];
		int idx = 0 ;
		int open = 0 ;
		
		int close = 0 ;
		
		solveBracketSolutions(arr,idx,arr.length,open,close);
	}

	private static void solveBracketSolutions(char[] arr, int idx, int length, int open, int close) {

		
		if(idx == length) {
			System.out.println(arr.length);
			for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);	
			}
			System.out.println("");
		}
		 if(open < length/2) {
			arr[idx] = '(';
			solveBracketSolutions(arr, idx+1, length, open+1, close);
		}if(close < open) {
			arr[idx] = ')';
			solveBracketSolutions(arr, idx+1, length, open, close+1);
		}
		
	}
}
