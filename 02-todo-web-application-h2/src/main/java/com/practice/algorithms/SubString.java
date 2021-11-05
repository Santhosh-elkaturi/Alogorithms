package com.practice.algorithms;

public class SubString {

	public static boolean substringOrNot(String str) {
		
		return (str.substring(1) + str.substring(0, str.length() - 1)).contains(str);
		
		
	}
	
	public static void main(String[] args) {
		String str = "sbsb";
		
		boolean result = substringOrNot(str);
		System.out.println(result);
		System.out.println(str);
		System.out.println(str.substring(1));
		System.out.println(str.substring(0, str.length() - 1));
		
		//System.out.println(str.substring(0, 1));
		//System.out.println(str.substring(2, str.length()-1));
		System.out.println(str.substring(1) + str.substring(0, str.length() - 1));
		
		//return (str.substring(1) + s.substring(0, s.length() - 1)).contains(s);
	}

	
}
