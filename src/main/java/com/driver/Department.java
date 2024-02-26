package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private List<Employee> employees = new ArrayList<Employee>();

	public Department(String name) {
		this.name = name;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public String getName() {
		return name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
}