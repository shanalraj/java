package com.ford.carDealer;

public class Employee  {
	
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void handleCustomer(Customer c1, Vehicle v1, boolean finance) {
		
		if(finance) {
//			this.checkFinanceEligibility(c1.getCashOnHand(),v1.getPrice());
//			double loanAmount=v1.getPrice() - c1.getCashOnHand();
			double loanAmount = this.checkFinanceEligibility(c1.getCashOnHand(),v1.getPrice());
			if (loanAmount>0) {
				this.processLoan(c1,loanAmount);
			}
			
		}else {
			
			processTransaction(c1,v1,c1.getCashOnHand(),v1.getPrice());
		}
	}
	
	private double checkFinanceEligibility(double cashOnHand, double price) {
		// TODO Auto-generated method stub
		double cashRequest = price-cashOnHand;
		if(cashRequest>0) {
			System.out.println("You are entitled to a loan of Rs: "+cashRequest);
			return cashRequest;
		}else {
			System.out.println("You have surplus amount of Rs: "+cashRequest +" to buy this vehicle. :-)");
			return cashRequest;
		}
	}

	private void processTransaction(Customer c1, Vehicle v1,double cashOnHand, double price) {
		
		
		if(cashOnHand<price) {
			System.out.println("You do not have sufficient balance to buy this item");
			
		}else {
			System.out.println(c1.getName()+"  purchased "+v1.getModel());
		}
	}

	public void processLoan(Customer c1, double loanAmout) {
		//
		if (loanAmout<=0) {
			System.out.println("You have enough money to buy the model.");
		}else {
			System.out.println("Loan request is registered and it is in Progress");
		}	
	}
}


