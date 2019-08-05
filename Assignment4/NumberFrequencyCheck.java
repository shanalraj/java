package com.shanalprograms;

public class NumberFrequencyCheck {

			public String digFrequency(int num)
			{
	           
	        int number = num;  
	        int[] dc=new int[10];
	        int[] freq = new int[10];
	         
	        while (number != 0)
	        {                         
	            int lastDigit = number % 10;  
	            freq[lastDigit]++;    
	            number = number / 10;
	        }
	         
	        int j=0;
	        for (int i = 0; i < freq.length; i++)
	        {
	            if(freq[i] != 0)
	            {            	
	            	dc[j]=freq[i];
	                j++;
	            }
	        } 
	        
	        Boolean flag=true;        
	              
	        for (int i = 0; i < j-1; i++)
	        {        	
	        	  
	        	  if(dc[i] != dc[i+1])
	        	  {
	        		  flag=false;
	        		  break;
	        	  }
	        }
	        if(flag)
	        {
	        	return "Same digit frequency";
	        }
	        
	        else
	        {
	        	return "Different Frequency";
	        }
	         
	      }
	}

	


