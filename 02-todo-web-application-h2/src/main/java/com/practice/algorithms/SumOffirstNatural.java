package com.practice.algorithms;

import java.util.Scanner;

public class SumOffirstNatural {

	public static void findSumOfNatural(int n) {
		
		int sn = n*(n+1)/2 ;
		System.out.println(sn);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <=t; i++) {
			int n=sc.nextInt();
			findSumOfNatural(n);
		}
	}

	
}
