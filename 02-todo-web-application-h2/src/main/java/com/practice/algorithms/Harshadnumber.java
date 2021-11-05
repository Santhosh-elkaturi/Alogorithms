package com.practice.algorithms;

import java.util.Scanner;

public class Harshadnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {

			int n = sc.nextInt();
			boolean harshadNumber = harshadNumber(n);
			System.out.println(harshadNumber);
		}
	}

	public static boolean harshadNumber(int n) {
		
		int sum = 0;
		int k = n;
		while (k != 0) {
			sum = sum + (k % 10);
			k = k / 10;
		}
		
		if(n%sum == 0) {
			return true;
		}else {
			return false;
			
		}
		
	}
}
