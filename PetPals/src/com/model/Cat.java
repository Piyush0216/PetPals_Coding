package com.model;

public class Cat extends Pets{
	private int petId;
	private String catColor;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(int petId, String catColor) {
		super();
		this.petId = petId;
		this.catColor = catColor;
	}
	@Override
	public String toString() {
		return "Cat [petId=" + petId + ", catColor=" + catColor + "]";
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getCatColor() {
		return catColor;
	}
	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}
	

}
