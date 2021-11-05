package com.practice.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindtheFloor {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long t = Long.parseLong(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int[] intArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArray[i] = Integer.parseInt(arr[i]);
		}
		int q = Integer.parseInt(br.readLine());
		int res = Integer.MIN_VALUE;

		for (int i = 1; i <= q; i++) {

			int x = Integer.parseInt(br.readLine());
			if (x < intArray[0]) {
				res = Integer.MIN_VALUE;
			} else if (x > intArray[intArray.length - 1]) {
				res = intArray[intArray.length - 1];
			} else {
				res = findFloorOf(0, intArray, intArray.length, x, res);
			}
			bw.write(res + "\n");
		}
		bw.flush();
	}

	static int findFloorOf(int l, int[] intArray, int h, int x, int res) {
		if (l > h) {
			return res;
		}
		int mid = (l + h) / 2;// -6 -1 5 10 15 20
		if (intArray[mid] == x) {
			return intArray[mid];
		} else if (intArray[mid] > x) {
			h = mid - 1;
			res = intArray[mid];
			return findFloorOf(l, intArray, h, x, res);
		} else {
			l = mid + 1;
			res = intArray[mid];
			return findFloorOf(l, intArray, h, x, res);
		}
	}
}
