package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierfDemo {// implements Supplier<String> {

	/*
	 * @Override public String get() { return "Hi Santhosh"; }
	 */

	public static void main(String[] args) {
		//Supplier<String> supplier = new SupplierfDemo();
		
		Supplier<String> supplier = () -> "Hi Santhosh"; 
		
		System.out.println(supplier.get());
		
		List<String> list = Arrays.asList();
		String orElseGet = list.stream().findAny().orElseGet(() -> "Hi ");
		System.out.println(orElseGet);
		
		
	}

}
