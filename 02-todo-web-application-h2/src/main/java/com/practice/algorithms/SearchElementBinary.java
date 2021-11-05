package com.practice.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchElementBinary {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			set.add(Integer.parseInt(arr[i]));
			//System.out.println(searchValue);
		}
		int[] intArr = new int[set.size()];
		int q = Integer.parseInt(br.readLine());
		int idx = 0;
		for (int i : set) {
			intArr[idx] = i;
			idx++;
			
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= q; i++) {
			int value = Integer.parseInt(br.readLine());
			list.add(value);
		}
		for (Integer num : list) {
			//boolean searchValue = searchValue(num,intArr,0,intArr.length-1);
			System.out.println(set.contains(num));
		}
			
	}

	private static boolean searchValue(int i, int[] intArr, int start, int end) {
		
		  if(intArr==null || intArr.length<0){
	            return false;
	       }
		while(start<=end) {
			int mid = (start+end)/2;
			if(intArr[mid] == i) {
				return true;
			}else if(intArr[mid] > i) {
				end = mid - 1;
				
			}else {
				start = mid+1 ;
			}
		}
		return false;
		// TODO Auto-generated method stub
		
	}
}
