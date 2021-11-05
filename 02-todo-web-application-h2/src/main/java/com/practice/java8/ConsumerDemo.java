package com.practice.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/*
 * public class ConsumerDemo implements Consumer<Integer>{
 * 
 * @Override public void accept(Integer t) { // TODO Auto-generated method stub
 * System.out.println("printing value "+ t); }
 * 
 * public static void main(String[] args) { ConsumerDemo }
 * 
 * }
 */

class Student {
	private int id;
	private String name;
	private Float salary;

	public Student(int i, String name, float j) {
		this.id = i;
		this.name = name;
		this.salary = j;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

}

class StudentComaparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

public class ConsumerDemo {

	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer =t->System.out.println("printing value "+ t);
		 * consumer.accept(10);
		 */

		List<Student> studentsList = new ArrayList<Student>();
		Student s1 = new Student(1, "esps", 50000);
		Student s2 = new Student(2, "kumar", 60000);
		Student s3 = new Student(3, "santhosh", 70000);
		Student s4 = new Student(4, "xyz", 90000);
		Student s5 = new Student(5, "abc", 10000);

		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		System.out.println("before sort");
		System.out.println(studentsList.toString());

		/*
		 * Collections.sort(studentsList, new StudentComaparator());
		 * System.out.println("after sort");
		 * System.out.println(studentsList.toString());
		 */
		
		/*
		 * System.out.println("Using AnonymsInnerclass"); Collections.sort(studentsList,
		 * new Comparator<Student>() {
		 * 
		 * public int compare(Student o1, Student o2) {
		 * 
		 * return o1.getName().compareTo(o2.getName()); } });
		 */
		
		System.out.println("Using JAVA 8");
		
		Collections.sort(studentsList,(o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println(studentsList.toString());
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.stream().forEach(t -> System.out.println("printing value " + t));
		
	}

}