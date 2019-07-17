package shanal;

import java.util.Scanner;

public class CalculatorImp {

	public static void main(String[] args) {
	Calculator cal = new Calculator();
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter 1 for addition, 2 for Subtraction, 3 for Multiplication and 4 for Division");
	int input = sc.nextInt();
	switch(input){
	case 1: 
		System.out.println("Enter 1 for add two numbers and enter 2 for add three numbers");
		int input1 =sc.nextInt();
		switch(input1){
		case 1: 
			System.out.println("Enter number1:");
			int n1= sc.nextInt();
			System.out.println("Enter number2:");
			int n2 = sc.nextInt();
			cal.add(n1, n2);
			break;
		case 2:
			System.out.println("Enter number1:");
			int num1= sc.nextInt();
			System.out.println("Enter number2:");
			int num2 = sc.nextInt();
			System.out.println("Enter number3:");
			int num3 = sc.nextInt();
			cal.add(num1,num2,num3);
			break;
			default: System.out.println("Invalid input");
		}
	case 2:
		System.out.println("Enter 1 for subtract two numbers and 2 for subtract three numbers");
		int input2 = sc.nextInt();
		switch(input2){
		case 1:
			System.out.println("Enter number1:");
			int snum1=sc.nextInt();
			System.out.println("Enter number2:");
			int snum2 = sc.nextInt();
			cal.subtract(snum1, snum2);
			break;
		case 2:
			System.out.println("Enter number1:");
			int subnum1=sc.nextInt();
			System.out.println("Enter number2:");
			int subnum2 = sc.nextInt();
			System.out.println("Enter number3:");
			int subnum3 = sc.nextInt();
			cal.subtract(subnum1, subnum2, subnum3);;
			break;
			default: System.out.println("Invalid Input");
		}
	case 3:
		System.out.println("Enter 1 for multiply 2 numbers and 2 for multiply three numbers");
		int input3 = sc.nextInt();
		switch(input3){
		case 1:
			System.out.println("Enter number 1:");
			int mnum1=sc.nextInt();
			System.out.println("Enter number2:");
			int mnum2=sc.nextInt();
			cal.multiply(mnum1, mnum2);
			break;
		case 2:
			System.out.println("Enter number1:");
			int mulnum1=sc.nextInt();
			System.out.println("Enter number2:");
			int mulnum2 = sc.nextInt();
			System.out.println("Enter number3");
			int mulnum3=sc.nextInt();
			cal.multiply(mulnum1, mulnum2, mulnum3);
			break;
			default: System.out.println("Invalid Input");
		}
	case 4:
		System.out.println("Enter 1 for divide 2 number and 2 for divide 3 numbers");
		int input4 = sc.nextInt();
		switch(input4){
		case 1:
			System.out.println("Enter number1:");
			int dnum1=sc.nextInt();
			if (dnum1 !=0){
				System.out.println("Enter number2:");
				int dnum2=sc.nextInt();
					if (dnum2 != 0){
						cal.divide(dnum1, dnum2);
					}
					else{
					System.out.println("Zero is invalid input in number2 and pleae enter a valid integer number");
					int dnum3 = sc.nextInt();
					cal.divide(dnum1, dnum3);
				}
			}
			else{
				System.out.println("Zero is invalid input in number1 and pleae enter a valid integer number");
				int dnum4 = sc.nextInt();
				System.out.println("Enter number2:");
				int dnum5=sc.nextInt();
				if (dnum5 !=0){
				cal.divide(dnum4, dnum5);
				}
			}
			
			break;
		
		
		case 2:
			System.out.println("Enter number1:");
			int divnum1 = sc.nextInt();
			System.out.println("Enter number2:");
			int divnum2 = sc.nextInt();
			System.out.println("Enter number3:");
			int divnum3= sc.nextInt();					
			cal.divide(divnum1, divnum2, divnum3);
			break;
			default: System.out.println("Invalid Input");
			

			
		}
	}

	}
}

