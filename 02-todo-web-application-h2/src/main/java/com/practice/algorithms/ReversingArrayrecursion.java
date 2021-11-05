package com.practice.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ReversingArrayrecursion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long t = Long.parseLong(br.readLine());
		
		String[] arr = br.readLine().split(" ");

		long[] longarray = new long[arr.length];
		for (int i = 0; i < arr.length; i++) {
			longarray[i] = Long.parseLong(arr[i]);
		}
		
		long[] revArray=reverseArray(longarray,0,longarray.length-1);
		
		for (int i = 0; i < revArray.length; i++) {
			System.out.print(revArray[i]+" ");
		}
		}

	public static long[] reverseArray(long[] intArray, int i, int j) {
		
		if(i<j) {
			long temp = intArray[i];
			intArray[i] = intArray[j];
			intArray[j]= temp	;	
			reverseArray(intArray,i+1,j-1);
		}
		return intArray;

	}
}

