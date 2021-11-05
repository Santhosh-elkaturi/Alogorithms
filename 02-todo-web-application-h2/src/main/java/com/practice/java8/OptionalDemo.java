package com.practice.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) throws Exception {
		Student student =  new Student(5, "abc", 25000);
		//empty
		//of
		//ofnullable
		
		Optional<Object>emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		/*
		 * Optional<String> ofOptional = Optional.of(student.getName());
		 * System.out.println(ofOptional);
		 */
		
		Optional<String> ofNullable = Optional.ofNullable(student.getName());
		System.out.println(ofNullable);
		
		Optional<String> ofNullable2 = Optional.ofNullable(student.getName());
		/*
		 * if(ofNullable2.isPresent()) {
		 * 
		 * System.out.println(ofNullable2.get());
		 * 
		 * }
		 */
		
		//String orElseThrow = ofNullable2.orElseThrow(()-> new IllegalArgumentException("exception raised"));
		String orElseGet = ofNullable2.map(String::toUpperCase).orElseGet(()->"default email");
		System.out.println(orElseGet);
		
		
		System.out.println(getStudentByName("kumar"));
		
	}

	private static Student getStudentByName(String name) throws Exception {
		
		List<Student> studentList = getStudentList();
		return studentList.stream()
				.filter(student -> student.getName().equals(name))
				.findAny().orElseThrow(()-> new Exception("no studnet is there with name "+name));

	}

	private static List<Student>  getStudentList() {
		return Stream.of(
		 new Student(1, "esps", 50000),
		 new Student(2, "kumar", 60000),
		new Student(3, "santhosh", 70000),
		new Student(4, "xyz", 90000),
		new Student(5, "abc", 10000)).collect(Collectors.toList());
		// TODO Auto-generated method stub
		
	}
}
