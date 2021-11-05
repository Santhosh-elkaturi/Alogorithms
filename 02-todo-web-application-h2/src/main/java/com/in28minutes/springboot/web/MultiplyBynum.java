package com.in28minutes.springboot.web;

import java.util.Scanner;

public class MultiplyBynum {
	public static void  multiplyBy3And5(int value){
        int sum = (value/3)+(value/5);
        System.out.println(sum);
    }
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       
           int inp1 = sc.nextInt();
           int inp2 = sc.nextInt();
           multiplyBy3And5(inp1);
           multiplyBy3And5(inp2);

      
       
   }
}