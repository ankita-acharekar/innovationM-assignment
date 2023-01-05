package com.deqode.backend2.innovationM_assignment.model;
/**
 * Author : Ankita Acharekar
 *
 */

import java.util.Date;
import java.util.List;

public class Employee {

	private int sequenceNo;	
	private String employeeId;
	private String EmpFName;
	private String EmpLName;
	private String Designation;
	private Date eventDate;
	private String eventRecordDate;
	private String eventRecordValue;
	private String event;
	private List<Events> events;
    private Integer salary=0;
    private Integer bonus=0;
	private Integer reimbursement=0;
	
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
	public Date getEventDate() {
		return eventDate;
	}
	public List<Events> getEvents() {
		return events;
	}
	public Integer getSalary() {
		return salary;
	}
	public Integer getBonus() {
		return bonus;
	}
	public Integer getReimbursement() {
		return reimbursement;
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
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public void setEvents(List<Events> events) {
		this.events = events;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	public void setReimbursement(Integer reimbursement) {
		this.reimbursement = reimbursement;
	}
	public String getEventRecordDate() {
		return eventRecordDate;
	}
	public String getEventRecordValue() {
		return eventRecordValue;
	}
	public String getEvent() {
		return event;
	}
	public void setEventRecordDate(String eventRecordDate) {
		this.eventRecordDate = eventRecordDate;
	}
	public void setEventRecordValue(String eventRecordValue) {
		this.eventRecordValue = eventRecordValue;
	}
	public void setEvent(String event) {
		this.event = event;
	}
}
