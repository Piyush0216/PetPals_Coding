package com.dto;

public class EventDto {
	private String eventName;
	private String eventDate;
	private String participantName;
	private String participantType;
	
	public EventDto(int id, String name, String date, String address) {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventDto(String eventName, String eventDate, String participantName, String participantType) {
		super();
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.participantName = participantName;
		this.participantType = participantType;
	}
	
	@Override
	public String toString() {
		return "EventDto [eventName=" + eventName + ", eventDate=" + eventDate + ", participantName=" + participantName
				+ ", participantType=" + participantType + "]";
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
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getParticipantType() {
		return participantType;
	}
	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}
	

}
