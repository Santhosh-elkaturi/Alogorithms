package com.practice.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateElmentsofArrayinOrder {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long t = Long.parseLong(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		
		int[] intArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		
		Map<Integer, Integer> map =  new HashMap<Integer, Integer>();// 2,1,2,3
		for (int i = 0; i < intArr.length; i++) {
			
			if(map.containsKey(intArr[i])) {
				map.put(intArr[i], map.get(intArr[i])+1);
			}else {
				map.put(intArr[i], 1);
			}
			
		}
		
		for (Integer key : map.keySet()) {
			if(map.get(key)>1)
				System.out.print(key+" ");
		}
		
	}
}
