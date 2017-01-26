package com;

import java.util.Date;

public class PersonalInfo {
    private int id;
	private String customerName;
	private String customerEmailId;
	private String mobileNumber;
	private String Address;
	private String modelNumber;
	private String serialNumber;
	private String damagePartName;
	private double totalAmount;
	private int numberOfTimesRepaired;
	private Date purchaseDate;
	private Date warrentyDate;
	private double AMC;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDamagePartName() {
		return damagePartName;
	}
	public void setDamagePartName(String damagePartName) {
		this.damagePartName = damagePartName;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNumberOfTimesRepaired() {
		return numberOfTimesRepaired;
	}
	public void setNumberOfTimesRepaired(int numberOfTimesRepaired) {
		this.numberOfTimesRepaired = numberOfTimesRepaired;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Date getWarrentyDate() {
		return warrentyDate;
	}
	public void setWarrentyDate(Date warrentyDate) {
		this.warrentyDate = warrentyDate;
	}
	public double getAMC() {
		return AMC;
	}
	public void setAMC(double aMC) {
		AMC = aMC;
	}
	
}
