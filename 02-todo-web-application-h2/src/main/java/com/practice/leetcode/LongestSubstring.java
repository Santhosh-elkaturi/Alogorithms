package com.practice.leetcode;

import java.util.HashSet;

public class LongestSubstring {
	public static void main(String[] args) {

		String s1 = "abcabcdbb";
		System.out.println(longestSubstring(s1));
	}

	private static int longestSubstring(String s1) {
		int a_pointer = 0;
		int b_pointer = 0;
		int max= 0;
		HashSet<Character> hashSet = new HashSet<>();
		HashSet<Character> hashSet2= new HashSet<>();
		
		while(b_pointer<s1.length()) {
			if(!hashSet.contains(s1.charAt(b_pointer))){
				hashSet.add(s1.charAt(b_pointer));
				if(hashSet.size()>max) {
					System.out.print(s1.charAt(b_pointer));
				}
				b_pointer++;
				max = Math.max(max, hashSet.size());
				
			}else {
				hashSet.remove(s1.charAt(a_pointer));
				a_pointer++;
			}
		}
		System.out.println();
			return max;
		
		// TODO Auto-generated method stub
		
	}
}
