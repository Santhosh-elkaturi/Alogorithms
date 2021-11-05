package com.practice.algorithms;

import java.util.Scanner;

public class ApoweofN {

	 static long powerOfA(long a, long n) {
		
		 if(n==0) {
			 return 1;
		 }
		 
		if(n%2==0) {
			return powerOfA(a, n/2) * powerOfA(a, n/2);
		}else {
			return a*powerOfA(a, n/2) * powerOfA(a, n/2);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
        int no = sc.nextInt();
        for(int i =1 ;i<=no;i++){
        	System.out.println("enter a value ");
            long a = sc.nextLong();
            System.out.println("enter n value ");
            long n = sc.nextLong();
            long powerOfA = powerOfA(a,n);
            if(powerOfA>Integer.MAX_VALUE) {
            	  System.out.println(powerOfA%1000000007);
            }else {
            
            System.out.println(powerOfA);
        }
        }
		
	}

	
}
