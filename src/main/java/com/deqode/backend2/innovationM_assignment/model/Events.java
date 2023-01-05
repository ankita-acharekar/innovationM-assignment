package com.deqode.backend2.innovationM_assignment.model;
/**
 * Author : Ankita Acharekar
 *
 */
public class Events {

	private String Event;
	private String eventEmpId;
	private String EventValue;
	private String notes;
	
	public String getEvent() {
		return Event;
	}
	public String getEventValue() {
		return EventValue;
	}
	public String getNotes() {
		return notes;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public void setEventValue(String eventValue) {
		EventValue = eventValue;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getEventEmpId() {
		return eventEmpId;
	}
	public void setEventEmpId(String eventEmpId) {
		this.eventEmpId = eventEmpId;
	}
}
