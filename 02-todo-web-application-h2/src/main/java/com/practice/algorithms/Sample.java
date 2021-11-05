package com.practice.algorithms;

import java.time.LocalDate;

public class Sample {
	public static void main(String[] args) {
		int days = 365;
		LocalDate date = LocalDate.now().minusDays(days);
		System.out.println(date);
	} 
}
