package com.model;

public class Pets {
	private int petId;
	private String name;
	private int age;
	private String breed;
	private String availableToAdopt;
	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pets(int petId, String name, int age, String breed, String availableToAdopt) {
		super();
		this.petId = petId;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.availableToAdopt = availableToAdopt;
	}
	
	@Override
	public String toString() {
		return "Pets [petId=" + petId + ", name=" + name + ", age=" + age + ", breed=" + breed + ", availableToAdopt="
				+ availableToAdopt + "]";
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getAvailableToAdopt() {
		return availableToAdopt;
	}
	public void setAvailableToAdopt(String availableToAdopt) {
		this.availableToAdopt = availableToAdopt;
	}

}
