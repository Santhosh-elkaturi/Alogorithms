package com.practice.algorithms;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {

			int n = sc.nextInt();
			printBinary(n);
		}
	}

	public static void printBinary(int n) {

		if (n > 1) {
			printBinary(n / 2);
		}
		/* step 2 */
		System.out.print(n % 2);

	}

}
