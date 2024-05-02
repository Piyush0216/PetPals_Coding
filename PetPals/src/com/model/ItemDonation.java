package com.model;

public class ItemDonation extends Donation{
	private int itemId;
	private String itemType;
	private String donationDate;
	public ItemDonation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDonation(int itemId, String itemType, String donationDate) {
		super();
		this.itemId = itemId;
		this.itemType = itemType;
		this.donationDate = donationDate;
	}
	@Override
	public String toString() {
		return "ItemDonation [itemId=" + itemId + ", itemType=" + itemType + ", donationDate=" + donationDate + "]";
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	

}
