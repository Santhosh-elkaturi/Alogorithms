package com.in28minutes.springboot.web;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {

		int n = 6;
		

		for (int i = 1; i <= n; i++) {

			int factor =n-1;
			int x = i+factor;
			System.out.print(i + " ");
			
			for (int j = 1; j < i ; j++) {

				System.out.print(x + " ");
				factor--;
				x+=factor;
			}
			System.out.println("");
		
			System.out.println(" ");

		}
	}
}
