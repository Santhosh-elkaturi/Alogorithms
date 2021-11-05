package com.practice.algorithms;

import java.util.Scanner;

public class SumofSquare {
	
	public static void squareSum(int val){
        long sum = 0;
        for(int i = 1 ;i<=val;i++){
            sum = sum+(i*i);
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            int num = sc.nextInt();
            squareSum(num);
        }
    }
}
