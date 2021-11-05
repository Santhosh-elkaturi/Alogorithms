package com.practice.algorithms;

public class RevreseOfString {

	public static void main(String[] args) {
		String name = "Test1ng-Leet=code-Q!";
		char[] charArray = name.toCharArray();
		
		int right = charArray.length - 1;
		int left = 0;
		
		while(left < right) {
			if(!Character.isAlphabetic(charArray[right])) {
				right--;
			}else if(!Character.isAlphabetic(charArray[left])) {
				left++;
			}else {
				char temp = charArray[left];
				charArray[left]= charArray[right];
				charArray[right] = temp;
				left++;
				right--;
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

	}
}
