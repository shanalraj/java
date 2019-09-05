package com.ford.carDealer;

public class Customer {
	
	String name;
	String address;
	double cashOnHand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	public void purchaseVehicle(Employee emp1, Vehicle v1, boolean finance) {
		emp1.handleCustomer(this,v1,finance);
		
	}
}
