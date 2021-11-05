package com.in28minutes.springboot.web;

public class PrintPyramid {

	public static void main(String[] args) {
		int n = 5;
		int k = 0;

		for (int i = 1; i <= n; i++ ,k=0) {

			for (int st = 1; st <= (n - i); ++st) {

				System.out.print("  ");
			}
			 while (k != 2 * i - 1) {
			        System.out.print("* ");
			        k++;
			      }

			System.out.println(" ");
			
			
		}
		
		
	}

}
