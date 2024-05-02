package com.model;

public class Donation {
	private int donorId;
	private String donorName;
	private double amount;
	private int petId;

	public Donation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donation(int donorId, String donorName, double amount, int petId) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.amount = amount;
		this.petId = petId;
	}

	@Override
	public String toString() {
		return "Donation [donorId=" + donorId + ", donorName=" + donorName + ", amount=" + amount + ", petId=" + petId
				+ "]";
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

}
