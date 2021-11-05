package com.practice.json;

import java.util.List;

public class Employeee {
	
	  private int empId;
	    private String name;
	    private List<String> address;
	    
	    public Employeee() {
	          super();
	    }
	    
	    public Employeee(int empId, String name, List<String> address) {
	          super();
	          this.empId = empId;
	          this.name = name;
	          this.address = address;
	    }
	    
	    @Override
	    public String toString() {
	          return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	    }
	    

	    //Setter and getters
	    public int getEmpId() {
	          return empId;
	    }
	    public void setEmpId(int empId) {
	          this.empId = empId;
	    }
	    public String getName() {
	          return name;
	    }
	    public void setName(String name) {
	          this.name = name;
	    }
	    public List<String> getAddress() {
	          return address;
	    }
	    public void setAddress(List<String> address) {
	          this.address = address;
	    }


}
