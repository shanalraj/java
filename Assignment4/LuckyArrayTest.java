package com.shanaltest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.shanalprograms.LuckyArray;

import static org.junit.Assert.*;

import org.junit.Test;



public class LuckyArrayTest {

	@Test
	public void test() {

		LuckyArray la = new LuckyArray();
		int[] numbers = { 10, 11, 12, 13, 1, 2, 54, 77 };
		assertEquals("Array is Lucky", la.luckyArray(numbers));

	}

	@Test
	public void test1() {
		
		LuckyArray la = new LuckyArray();
		int[] numbers = { 10, 11, 12, 13, 1, 2, 54, 77, 11 };
		assertEquals("Array is not Lucky", la.luckyArray(numbers));

	}

}