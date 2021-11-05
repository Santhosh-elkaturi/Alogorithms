package com.practice.leetcode;

public class LongestSubstringPolindrome {
	
	public static String logestPolindrome(String s) {
		
		if(s==null || s.length()<1) {
			return "";
		}

		int start = 0;
		int end = 0;
		
		for(int i =0 ;i <s.length();i++) {
			int len1 = expnadFromMiddle(s,i,i);
			System.out.println("len1 "+len1);
			int len2 = expnadFromMiddle(s,i,i+1);
			System.out.println("len2 "+len1);
			int len = Math.max(len1, len2);
			System.out.println(len);
			if(len > end - start) {
				start = i -(len-1)/2;
				end = i+(len)/2 ;
			}
			
		}
		return s.substring(start,end+1);
		
	}
	
	private static int expnadFromMiddle(String s, int left, int right) {
		if(s == null || left>right) {
			return 0 ;
		}
			
		while(left>=0 &&right<s.length() && s.charAt(left) ==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}

	public static void main(String[] args) {
		System.out.println(logestPolindrome("ababbg"));
		
	}

}
