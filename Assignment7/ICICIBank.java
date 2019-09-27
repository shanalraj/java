package com.atmdetails;

import java.io.IOException;

public class ICICIBank implements Bank {
	String name;
	int serviceCharge=5;

	@Override
	public void withDrawal(String atmNo) throws IOException
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(int serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	@Override
	public void balanceEnquiry()
	{
		
	}
}