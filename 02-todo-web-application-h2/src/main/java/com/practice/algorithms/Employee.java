package com.practice.algorithms;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age ;
	private String country;
	
	public Employee(Integer id, String name, Integer age,String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
	
}

