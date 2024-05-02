package com.model;

public class Participant {
	private int partcipantId;
	private String participantName;
	private String participantType;
	
	private int petId;
	private int eventId;
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Participant(int partcipantId, String participantName, String participantType, int petId, int eventId) {
		super();
		this.partcipantId = partcipantId;
		this.participantName = participantName;
		this.participantType = participantType;
		this.petId = petId;
		this.eventId = eventId;
	}
	@Override
	public String toString() {
		return "Participant [partcipantId=" + partcipantId + ", participantName=" + participantName
				+ ", participantType=" + participantType + ", petId=" + petId + ", eventId=" + eventId + "]";
	}
	public int getPartcipantId() {
		return partcipantId;
	}
	public void setPartcipantId(int partcipantId) {
		this.partcipantId = partcipantId;
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
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

}
