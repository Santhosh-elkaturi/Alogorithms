package com.in28minutes.springboot.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamIterator {

	public static void main(String[] args) {
		/*
		 * Stream.iterate(1, count->count+1) .filter(number->number%3==0 && number <6)
		 * .limit(2) .forEach(System.out::println);
		 */ 
		
		
		List<String> names =
		          Arrays.asList("Jon", "Ajeet", "Steve",
		             "Ajeet", "Jon", "Ajeet");

		      Map<String, Long> map =
		      names.stream().collect(
		          Collectors.groupingBy(
		             Function.identity(), Collectors.counting()
		          )
		      );

		      System.out.println(map);

		
    }  
}
