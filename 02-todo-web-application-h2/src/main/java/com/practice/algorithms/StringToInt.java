package com.practice.algorithms;

public class StringToInt {

	public static int ConvertStringToInt(String s) throws NumberFormatException
	{
	    int num =0;
	    for(int i =0; i<s.length();i++)
	    {
	        if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57))
	        {
	            num = num*10+ ((int)s.charAt(i)-48);
	        }
	        else
	        {
	        	
	            throw new NumberFormatException();
	        }

	    }
	    return num; 
	}
	
	public static void main(String[] args) {
		 //System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
	       // System.out.println("\"76289\" == "+convert_String_To_Number("76289"));
	        //System.out.println("\"90087\" == "+convert_String_To_Number("90087"));
	        //asciiCall(10);
	       System.out.println(convert_String_To_Number("3256"));
	}

	private static int convertAllsignNumbers(String num) {
		
		int sum = 0;
		
		char[] charArray = num.toCharArray();
		for (char c : charArray) {
			sum = (sum*10)+ (int)c - (int)0 ;
		}
		return sum;
	}

	private static void asciiCall(int i) {
		  
		  for (char ch='A' ; ch<='Z' ;ch++) {
			
		
	        int ascii = ch;
	        // You can also cast char to int
	        int castAscii = (int) ch;

	        System.out.println("The ASCII value of " + ch + " is: " + ascii);
	        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
		  }
	}

	private static int convert_String_To_Number(String numStr) {
		 char ch[] = numStr.toCharArray();
	        int sum = 0;
	        //get ascii value for zero
	        
	        int zeroAscii = (int)'0';
	        for(char c:ch){
	            int tmpAscii = (int)c;
	            sum = (sum*10)+(tmpAscii-zeroAscii);
	            System.out.println(sum);
	        }
	        return sum;
	    
	}
}
