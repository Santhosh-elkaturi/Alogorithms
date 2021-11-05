package com.practice.algorithms;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static boolean checkArmStrong(long number) {
		
		long  total = 0 ;
		long x = number;
		 while (number != 0)
	        {
			 long temp = x % 10;
	            total = total + temp*temp*temp;
	            x /= 10;
	        }

	        if(total == number) {
	           return true;
	        }
	        else {
	        	return false;
	    }
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <=t; i++) {
			long n = sc.nextLong();
			 System.out.println(checkArmStrong(n));
		}
	}

	

}
