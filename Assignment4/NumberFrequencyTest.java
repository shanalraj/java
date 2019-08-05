package com.shanaltest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.shanalprograms.NumberFrequencyCheck;



public class NumberFrequencyTest {


	@Test
	public void test()
	   {		
		NumberFrequencyCheck d=new NumberFrequencyCheck();		
		assertEquals("Same digit frequency",d.digFrequency(112233));
	   }

	@Test
	public void test1()
	   {		
		NumberFrequencyCheck d=new NumberFrequencyCheck();		
		assertEquals("Different Frequency",d.digFrequency(1122313));
	   }
}
