package com.demo;
/**
 * @author Rajeev Gupta
 * Date : 27/12/2019
 * Employee is created for Java training
 *
 */
public class Employee {
	private int id;
	private String name;
	private double salary;
	/**
	 * @param id : id to be passed from the user, should be unique
	 * @param name : name to be passed from the user, should not be null
	 * @param salary: salary to be passed from the user, should not be null
	 */
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * 
	 * @return it return tax applicable to the employee
	 */
	public double calculatedTax(){
		return salary*.2;
	}
	
	/**
	 * This is default constructor
	 */
	public Employee() {
		
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
