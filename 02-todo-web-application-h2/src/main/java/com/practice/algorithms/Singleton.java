package com.practice.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Singleton {
	
	private static Singleton instance = null; 
	
	private Singleton() {
		
	}
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton(); 
				}
			}
			
		}
		return instance;
	}
	public static void main(String[] args) {
		Singleton inSingleton = Singleton.getInstance();
		Singleton inSingleton2 = Singleton.getInstance();
		System.out.println(inSingleton);
		System.out.println(inSingleton2);
		
		List<Employee> emps = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.setAge(1);
		employee.setCountry("india");
		employee.setId(11);
		employee.setName("skm");
		
		Employee employee2= new Employee();
		employee2.setAge(2);
		employee2.setCountry("india");
		employee2.setId(22);
		employee2.setName("skms");
		
		Employee employee3 = new Employee();
		employee3.setAge(3);
		employee3.setCountry("india");
		employee3.setId(33);
		employee3.setName("ddskm");
		
		emps.add(employee);
		emps.add(employee2);
		emps.add(employee3);
		
		
		Employee empmax = emps.stream().reduce((e1,e2)-> e1.getAge()>e2.getAge()?e1:e2).get();
		
		Optional<Employee> findFirst = emps.stream()
        .sorted(Comparator.comparingDouble(Employee::getAge).reversed()).skip(1).findFirst();
		
		System.out.println(findFirst.get());
		
		//emps.stream().collect(Collectors.maxBy.(Comparator.comparingInt(Employee::getAge).reversed()).skip(1).findFirst();
	
		}

}
