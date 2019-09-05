package com.ford.carDealer;

public class Dealership {
	
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setName("Sathish");
		
		Vehicle v1=new Vehicle();
		v1.setMake("Ford");
		v1.setModel("2019");
		v1.setPrice(1000000);
		
		
		Vehicle v2=new Vehicle();
		v2.setMake("Ford");
		v2.setModel("2018");
		v2.setPrice(600000);
		
		Customer c1=new Customer();
		c1.setName("Tom");
		c1.setAddress("Chennai");
		c1.setCashOnHand(500000);
		
		boolean finance=false;
		c1.purchaseVehicle(emp1,v2,finance);
	}
}
