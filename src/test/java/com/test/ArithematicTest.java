package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.arithematic.AddTwoNumbers;

public class ArithematicTest {
   
	AddTwoNumbers atn;
	
	@Test
	public void positiveTest ()  {
		atn = new AddTwoNumbers();
		Assert.assertEquals(4, atn.add(2,2));
	}
	
	@Test
	public void positiveTest1 ()  {
		atn = new AddTwoNumbers();
		Assert.assertEquals(-2, atn.add(2,-4));
	}
	
	@Test()
	public void negativeTest ()  {
		atn = new AddTwoNumbers();
		Assert.assertEquals(6, atn.add(2/0,4));
	}
	
	@Test()
	public void negativeTest1 ()  {
		atn = new AddTwoNumbers();
		Assert.assertEquals(6, atn.add(2,4/0));
	}
	
}
