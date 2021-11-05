package com.practice.algorithms;

public class RemovingAdjecent {

	public static String NonAdjectChracters2(String str) {

		char[] charArr = new char[str.toCharArray().length];
		int x = 0 ;
		char[] strChars = str.toCharArray();// x a a a  y b b b a a a
		char k = '\n' ;
		char y = '\n' ;
		int i = 0;

		for (int j = 1; j < strChars.length; j++) {
			if (strChars[j] != strChars[i] && strChars[i]!= k) {
				
				charArr[x] = strChars[i];
				y = charArr[x];
				x++;
				i++;
	           
	           // strChars[i] = strChars[j];
	        }else {
	        	k = strChars[i];
	        	i++;
	        }
			
		}
		String stt = "";

		for (int p = 0; p < charArr.length; p++) {
			
				if(charArr[p]!='\n') {
					stt = stt + charArr[p];
				}
				
			
		}
		return stt;

		

	}

	public static String NonAdjectChracters(String str) {

		String stt = "";
		char[] charArray = str.toCharArray();
		int j = 0;
		char c = '\n';
		for (int i = 1; i < charArray.length; i++) {

			if (charArray[j] == charArray[i]) {
				charArray[i] = '_';
				charArray[j] = '_';
				if (j != 0) {
					j--;
				} else {
					j++;
				}

			} else {
				j++;
			}
		}

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != '_') {

				stt = stt + charArray[i];
			}
		}
		return stt;

	}

	public static void main(String[] args) {
		String str = "aaa";
		//String output = NonAdjectChracters(str);
		//String output2 = NonAdjectChracters2(str);
		String output3 = NonAdjectChracters3(str);
		System.out.println(output3);

	}

	public static String NonAdjectChracters3(String str) {

		 StringBuilder sb = new StringBuilder();
	     for (char ch: str.toCharArray()) {
	         if (sb.length() != 0 && sb.charAt(sb.length() - 1) == ch ) {
	             sb.deleteCharAt(sb.length() - 1);
	         } else {
	             sb.append(ch);
	         }
	     }
	     return sb.toString();	
	}
}
