package com.atmdetails;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AtmDetails {

public static void main(String[] args) throws IOException {		
		
		
		System.out.println("Please enter the Atm Card Number");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	
		AtmTransactions at=new AtmTransactions();
		boolean a=true;
	
		if(at.verifyAtmNumber(s))
		{
			while(a)
			{
			System.out.println("What operation do you want to perform?");
			System.out.println("1.) Balance Enquiry \n2.) Withdrawal  \n3.) Deposit \n4.) Exit");
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1: at.balanceEnquiry(s);
			        break;
			
			case 2: at.withdrawal(s);
			        break;
			        
			case 3: at.depositCash(s);
	                break;
	                
			case 4: a=false;
			        break;
			        
			default: System.out.println("Enter a valid option");
			
			}
		}
			
		}
	}
}
