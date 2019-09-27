package com.atmdetails;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class AtmTransactions {
	
	static ArrayList<CardDetails> cd = new ArrayList<CardDetails>();

	public AtmTransactions() {
		File f = new File("C:\\Users\\tshanalr\\Documents\\JavaTraining\\SourceData\\ATMDetails.txt");
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while (s != null) {
				// System.out.println(s);

				String[] s1 = s.split(",");
				CardDetails c = new CardDetails();
				c.setCardNumber(Integer.parseInt(s1[0]));
				c.setName(s1[1]);
				c.setBankName(s1[2]);
				c.setBalance(Double.parseDouble(s1[3]));
				cd.add(c);
				s = br.readLine();

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void displayAtmDataAfterUpdate(String atmNo) throws IOException {
		File f = new File("C:\\Users\\tshanalr\\Documents\\JavaTraining\\SourceData\\ATMDetails.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null) {

			String[] s1 = s.split(",");
			if (s1[0].equals(atmNo)) {
				System.out.println(s + " \n");
				break;
			}

			s = br.readLine();
		}
		br.close();
	}

	public void writeAtmDataToFile() throws IOException {
		File f = new File("C:\\Users\\tshanalr\\Documents\\JavaTraining\\SourceData\\ATMDetails.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);

		for (CardDetails cardDetails : cd) {

			fw.write(cardDetails.getCardNumber() + "," + cardDetails.getName() + "," + cardDetails.getBankName() + ","
					+ cardDetails.getBalance() + "\n");
		}
		fw.close();
		bw.close();

	}

	public Boolean verifyAtmNumber(String s1) throws IOException {

		for (CardDetails cardDetails : cd) {

			if (cardDetails.getCardNumber() == Integer.parseInt(s1)) {
				System.out.println("\nATM card number entered is valid \n");
				return true;
			}

		}
		System.out.println("The ATM Card number entered is notvalid, aborting the operation");
		return false;
	}

	public void balanceEnquiry(String atmNo) {
		for (CardDetails cardDetails : cd) {
			if (cardDetails.getCardNumber() == Integer.parseInt(atmNo)) {
				System.out.println(
						"\nThe Balance for ATM Number: " + atmNo + " is: Rs." + cardDetails.getBalance() + "\n");
				break;
			}
		}
	}

	public void withdrawal(String atmNo) {

		System.out.println("Enter the amount to withdraw");
		Scanner sc = new Scanner(System.in);
		int withdrawalAmount = sc.nextInt();
		double balance = 0;
		int sr = 0;
		for (CardDetails cardDetails : cd) {

			if (cardDetails.getCardNumber() == Integer.parseInt(atmNo)) {

				balance = cardDetails.getBalance();

				switch (cardDetails.getBankName()) {
				case "HDFC":
					sr = new HdfcBank().getServiceCharge();
					break;
				case "ICICI":
					sr = new ICICIBank().getServiceCharge();
					break;
				default:
					System.out.println("No service charge");
				}

				if ((withdrawalAmount + sr) <= balance) {
					balance = balance - withdrawalAmount - sr;
					cardDetails.setBalance(balance);
				} else {
					System.out.println("Transaction declined due to insufficient cash");
				}

				break;
			}
		}

		try {
			writeAtmDataToFile();
			System.out.println(" \nWithdraw Successful, Updated Account Details is: ");
			displayAtmDataAfterUpdate(atmNo);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void depositCash(String atmNo) {

		System.out.println("Enter the amount to deposit");
		Scanner sc = new Scanner(System.in);
		int depositAmount = sc.nextInt();
		double balance = 0;

		for (CardDetails cardDetails : cd) {

			if (cardDetails.getCardNumber() == Integer.parseInt(atmNo)) {

				balance = cardDetails.getBalance();
				balance = balance + depositAmount;
				cardDetails.setBalance(balance);

				try {
					writeAtmDataToFile();
					System.out.println(" \nDeposit Successful, Updated Account Details is: ");
					displayAtmDataAfterUpdate(atmNo);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

	}
}
