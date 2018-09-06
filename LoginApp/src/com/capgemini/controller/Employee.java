package com.capgemini.controller;

public class Employee {
	private long employeeid;
	private String employeename;
	private double salary;
	private String nameofdepartment;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeid, String employeename, double salary, String nameofdepartment) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
		this.nameofdepartment = nameofdepartment;
	}

	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getNameofdepartment() {
		return nameofdepartment;
	}

	public void setNameofdepartment(String nameofdepartment) {
		this.nameofdepartment = nameofdepartment;
	}
}
	

