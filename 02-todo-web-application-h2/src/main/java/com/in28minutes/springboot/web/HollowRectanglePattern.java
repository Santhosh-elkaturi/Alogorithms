package com.in28minutes.springboot.web;

import java.util.Scanner;

public class HollowRectanglePattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w = 5;
		int l = 4;

		for (int i = 1; i <= l; i++) {

			if (i == 1 || i == l) {
				for (int j = 1; j <= w; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= w; j++) {
					if (j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}

			}

			System.out.println(" ");
		}
	}
}
