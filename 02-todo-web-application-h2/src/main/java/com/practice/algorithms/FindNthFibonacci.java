package com.practice.algorithms;

import java.util.Scanner;

public class FindNthFibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println( fib(n));
		System.out.println( fibRec(n));
		System.out.println( fibBU(n));		
	}

	private static int fib(int N) {

		if (N <= 1) {
			return N;
		}
		if (N == 2) {
			return 1;
		}

		int current = 0;
		int prev1 = 1;
		int prev2 = 1;

		for (int i = 3; i <= N; i++) {
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}
		return current;

	}

	public static int fibRec(int n){
	    if(n==0||n==1){
	        return n;
	    }
	    return fibRec(n-1)+fibRec(n-2);
	}
	
	public static int fibBU(int n){
	    int[] strg =  new int[n+1];
	    strg[0]=0;
	    strg[1]=1;
	    for(int i=2;i<=n;i++){
	        strg[i]= strg[i-1]+strg[i-2];
	    }
	    return strg[n];
	}

}
