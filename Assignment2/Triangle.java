package shanal;

import java.util.Scanner;

public class Triangle {

	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
			
	int initval=1;
	int col=1;
	System.out.println("Enter the number: ");
	int n =sc.nextInt();
	for (int row=1;row<=n;row++)
	{
	 System.out.print(row+" ");
	if(col==initval)
	{
	System.out.println();
	initval++;
	col=1;
	if ((n-row)<initval)
	{
		break;
	}
	}
	else
	{
	col++;
	}
	}
	
}}