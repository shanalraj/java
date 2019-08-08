package com.shanalprograms;

public class PaternPrint2 {
	
	    static void print(int [][] paternarr) 
	    { 
	       
	        for (int i = 0; i < paternarr.length; i++) 
	        { 
	  
	            
	            if (i % 2 == 0) 
	            { 
	                for (int j = 0; j < paternarr[0].length; j++) 
	                    System.out.print(paternarr[i][j] +" "); 
	  
	  
	            } 
	            else
	            { 
	                for (int j = paternarr[0].length - 1; j >= 0; j--) 
	                    System.out.print(paternarr[i][j] +" "); 
	            } 
	        } 
	    } 
	  
	  
	    public static void main(String[] args) 
	    { 
	        int mat[][] = new int[][] 
	        { 
	            { 10, 15, 20, 25 }, 
	            { 30, 35, 40, 45 }, 
	            { 50, 55, 60, 65 }, 
	            { 70, 75, 80, 85 } 
	        }; 
	  
	        print(mat); 
	    } 
	} 
	
