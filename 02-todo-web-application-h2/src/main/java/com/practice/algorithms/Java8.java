package com.practice.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {

	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Santhosh");
		emp1.setAge(27);
		emp1.setCountry("IND");
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(3);
		emp2.setName("Skm");
		emp2.setAge(19);
		emp2.setCountry("UK");
		empList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("kumar");
		emp3.setAge(21);
		emp3.setCountry("USA");
		empList.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setId(4);
		emp4.setName("kumeear");
		emp4.setAge(20);
		emp4.setCountry("USA");
		empList.add(emp4);
		
		List<Employee> list = empList.stream().filter(e -> e.getAge()>25).collect(Collectors.toList());
		System.out.println(empList.stream().mapToInt(e->e.getAge()).min());
		
		empList.sort((e1,e2)->e1.getAge().compareTo(e2.getAge()));
		empList.forEach(System.out::println);
		System.out.println(list.toString());
	
				  Map<String, Integer> map = empList.stream()
						  .collect(Collectors.groupingBy(Employee::getCountry,Collectors.summingInt(Employee::getAge)));
				
				  map.forEach((k, v) -> {
					  if(k!=null) {
				  
					  System.out.println("Key : " + k + ", Value : " + v);
					  }
				  });
					  
				List<String> Names = empList.stream().map(e->e.getName()).collect(Collectors.toList());
				System.out.println(Names);
				
				
                
		
	}
}
