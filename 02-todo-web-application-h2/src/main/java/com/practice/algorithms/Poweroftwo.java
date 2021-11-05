package com.practice.algorithms;

import java.util.Scanner;

public class Poweroftwo {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <=t; i++) {
			long n= sc.nextLong();
        	System.out.println(powerOfTwoOrnot(n));
		}
	}

	private static boolean powerOfTwoOrnot(long n) {
		
		if(n==1) {
			return true;
		}else if(!(n%2 == 0) || n == 0) {
			return false;
		}else {
			return powerOfTwoOrnot(n/2);
		}
		
	}
}
