package com.practice.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SquarRooTBS {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long t = Long.parseLong(br.readLine());
		for(int i=1;i<=t;i++) {
			long n = Long.parseLong(br.readLine());
			long res = SquareRoot(1,Math.min(n, 1_000_000_000),n); // 1 to 10^9 because 10^9 root of 10^18
			bw.write(res+"\n");
		}
		bw.flush();
	}

	 static long SquareRoot(long low, long high, long n) {
		if(low>high) {
			return 0;
		}
		long mid = (low+high)/2;
		if(mid*mid==n) {
			return mid ;
		}else if(mid*mid>n) {
			return SquareRoot(low, mid-1, n);
		}else {
			return SquareRoot(mid+1, high, n);
		}
		
	}
}
