package com.model;

public class AdoptionEvent {
	private int eventId;
	private String eventName;
	private String eventDate;
	private String eventAddress;
	public AdoptionEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdoptionEvent(int eventId, String eventName, String eventDate, String eventAddress) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventAddress = eventAddress;
	}
	@Override
	public String toString() {
		return "AdoptionEvent [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate
				+ ", eventAddress=" + eventAddress + "]";
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventAddress() {
		return eventAddress;
	}
	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}
	

}
