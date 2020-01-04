package com.cognizant.servlet;

import java.util.Date;

public class DateOfBirth {
	public int employeeId;
	public String employeeName;
	public String gender;
	public String employeeDob;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}
	public DateOfBirth(int employeeId, String employeeName, String gender, String employeeDob) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.employeeDob = employeeDob;
	}
	
}
