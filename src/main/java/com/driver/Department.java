package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Department {
	 private String name;
	    private List<Employee> employees = new ArrayList<Employee>();

	    public Department(String name) {
	    	// your code goes here
	    }

	    public void addEmployee(Employee employee) {
	    	// your code goes here
	    }

	    public String getName() {
	    	// your code goes here
	        return name;
	    }
	    
	    public List<Employee> getEmployees() {
	    	// your code goes here
	        return employees;
	    }
}
