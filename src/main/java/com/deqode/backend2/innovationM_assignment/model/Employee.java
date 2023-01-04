package com.deqode.backend2.innovationM_assignment.model;

import java.util.List;

public class Employee {

	private int sequenceNo;	
	private String employeeId;
	private String EmpFName;
	private String EmpLName;
	private String Designation;
	private String eventDate;
	private List<Events> events;
    private Integer salary;
	
	public int getSequenceNo() {
		return sequenceNo;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getEmpFName() {
		return EmpFName;
	}
	public String getEmpLName() {
		return EmpLName;
	}
	public String getDesignation() {
		return Designation;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmpFName(String empFName) {
		EmpFName = empFName;
	}
	public void setEmpLName(String empLName) {
		EmpLName = empLName;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public List<Events> getEvents() {
		return events;
	}
	public void setEvents(List<Events> events) {
		this.events = events;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
