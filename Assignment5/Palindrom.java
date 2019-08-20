package practice2019;

import java.util.Scanner;

public class Palindrom {
	
	public static void checkString(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str1=sc.next();
	StringBuilder sb= new StringBuilder(str1);
	String str2 = (sb.reverse().toString());
	System.out.println(str1);
	System.out.println(str2);
	if(str1.equals(str2)){
		System.out.println("Palindrom");
		}else{
			System.out.println("Not palindrom");
		}
	
	}

	public static void main(String[] args) {
Palindrom pal = new Palindrom();
pal.checkString();
		
		

	}

}
