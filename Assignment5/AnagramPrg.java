package practice2019;

import java.util.Scanner;

public class AnagramPrg {
	
	public static void main(String[] args) {
		
		int x = 0, y = 0;
		char ArrayA[] = new char[100];
		char ArrayB[] = new char[100];
		char temp;
		boolean match=true;
		
		System.out.println("Enter string1 : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		System.out.println("Enter string2 : ");
		Scanner sc1 = new Scanner(System.in);
		String s2 = sc1.nextLine();
		 
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		
		x=s3.length();
		y=s4.length();
		
		if (x!=y) {
			System.out.println("Not Anagrams");
		}
		else {
		for (int i=0; i<=x-1; i++) {			
			ArrayA[i]=(char) s3.charAt(i);
		}
				
		for (int i=1; i<x; i++) {
			for (int j=i; j>0; j--) {
			if (ArrayA[j] < ArrayA[j-1]) {
				temp=ArrayA[j];
				ArrayA[j]=ArrayA[j-1];
				ArrayA[j-1]=temp;
			}
			}
		}
		
		for (int i=0; i<=y-1; i++) {			
			ArrayB[i]=(char) s4.charAt(i);
		}
		for (int i=1; i<y; i++) {
			for (int j=i; j>0; j--) {
			if (ArrayB[j] < ArrayB[j-1]) {
				temp=ArrayB[j];
				ArrayB[j]=ArrayB[j-1];
				ArrayB[j-1]=temp;
			}
			}
		}
		
		for (int i=0; i<x; i++) {
			if (ArrayA[i] != ArrayB[i]) {
				match = false;
				break;
			}
		}
		 
		if (match==true) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
		}
	sc.close();	
	sc1.close();
	}

}
