package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class MapReduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,9,5);
		
		List<String> namesList = Arrays.asList("santhosh","kumarjjjjj","elkaturi");
		int sum1 = numbers.stream().mapToInt(a->a).sum();
		System.out.println(sum1);
		Integer reduceSum = numbers.stream().reduce(0, (a,b)-> a+b);
		System.out.println(reduceSum);
		
		Optional<Integer> methodreference = numbers.stream().reduce(Integer::sum);
		System.out.println(methodreference.get());
		
		OptionalInt max = numbers.stream().mapToInt(a->a).max();
		System.out.println(max);
		
		Integer maxwithreduce = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
		System.out.println(maxwithreduce);
		
		Integer multplication = numbers.stream().reduce(1, (a,b)->a*b);
		System.out.println(multplication);
		
		String longeststring = namesList.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(longeststring);
	}
}
