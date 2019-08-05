package com.shanalprograms;

public class LuckyArray {

		public String luckyArray(int numbers[])
	    {
	        
	             // int[] n=new int[10];
	           
	        Boolean flag=true;      
	        for (int i = 0; i < numbers.length-1; i++)
	        {      
	        	if (!flag)
	        	{
	        		break;
	        	}
	            
	        	for (int j = i+1; j < numbers.length; j++)
	        	if(numbers[i] == numbers[j])
	        	  {
	        		  flag=false;
	        		  break;
	        	  }
	        }
	        
	        if(flag)
	        {
	        	return "Array is Lucky";
	        }
	        
	        else
	        {
	        	return "Array is not Lucky";
	        }
	         
	      
	    }
	}


