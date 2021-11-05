package com.practice.algorithms;

public class TryCatchReturn {

	public static void main(String[] args) {
        System.out.println("method return -> "+m());
 }
 
 static String m(){
        try{
               int i=10/0;
               return "try";
        }catch (ArithmeticException e) {
        	return "catch";
		}
        finally {
			return "xxxx";
		}
 }
}
