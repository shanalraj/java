package com.atmdetails;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Bank {
	public void withDrawal(String atmNo) throws IOException;
	
	public void balanceEnquiry();
}
