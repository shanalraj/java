package com.atmdetails;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HdfcBank implements Bank {
	
	String name;
	int serviceCharge=10;

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