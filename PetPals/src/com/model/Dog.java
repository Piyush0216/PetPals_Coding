package com.model;

public class Dog extends Pets{
	private int petId;
	private String dogBreed;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(int petId, String dogBreed) {
		super();
		this.petId = petId;
		this.dogBreed = dogBreed;
	}
	@Override
	public String toString() {
		return "Dog [petId=" + petId + ", dogBreed=" + dogBreed + "]";
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getDogBreed() {
		return dogBreed;
	}
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}


}
