package com.practice.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortCustomizedMap {

	public static void main(String[] args) {
		/*
		 * Map<Student, Integer> studentMap = new TreeMap<>(new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { // TODO Auto-generated
		 * method stub return o1.getSalary().compareTo(o2.getSalary()); } });
		 */		
		
		Map<Student, Integer> studentMap = new TreeMap<>((o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
		studentMap.put(new Student(1, "esps", 50000), 50) ;
		studentMap.put(new Student(2, "kumar", 60000),60);
		studentMap.put(new Student(3, "santhosh", 70000),70);
		studentMap.put(new Student(4, "xyz", 90000),90);
		studentMap.put(new Student(5, "abc", 10000),10);
		
		//System.out.println(studentMap);
		ArrayList<Entry<Student, Integer>> studentEntries = new ArrayList<>(studentMap.entrySet());
	
		studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getSalary).reversed())).forEach(s-> System.out.println(s));
		studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName))).forEach(s-> System.out.println(s));

	}
}
