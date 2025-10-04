package com.tnsif.assignment1.employees;

	/**
	 * Represents a generic employee.
	 * Demonstrates private attributes with public getters and setters.
	 */
	public class Employee {
	    private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Constructor to initialize employee details.
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    protected void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    protected void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

