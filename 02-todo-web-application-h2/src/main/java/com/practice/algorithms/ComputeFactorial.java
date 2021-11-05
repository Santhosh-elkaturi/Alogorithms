package com.practice.algorithms;

import java.util.Scanner;

public class ComputeFactorial {

	
	  public static void main(String[] args) {
	        Scanner sc=  new Scanner(System.in);
	        int t = sc.nextInt();
	        
	         long m = 1000000007;
	        for (int i = 1; i <= t; i++) {
	            
	            int n = sc.nextInt();
	            System.out.println(factorial(n));
	        }
	        
	    }

	    public static long factorial(int n) {
	    	long m = 1000000007;
	        long sum = 1;
	        for(int i=1;i<=n;i++){
	            sum = (sum*i)%m;
	        }
	        return sum;
	        
	        
	    }

}
