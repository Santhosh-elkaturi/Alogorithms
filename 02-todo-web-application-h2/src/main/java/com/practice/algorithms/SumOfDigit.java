package com.practice.algorithms;

import java.util.Scanner;

public class SumOfDigit {

	public static int findSumValue(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}

		// TODO Auto-generated method stub
		return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int findSumValue = findSumValue(n);
		System.out.println(findSumValue);
	}
}
