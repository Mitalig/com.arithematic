package com.arithematic;

public class AddTwoNumbers {
	
	int c;

	public int add(int a, int b)  {
		
		try  {
		c=a+b;
		
		return c;
		
		}
		
		catch ( Exception e)  {
			
			System.out.println(e.getMessage());
		}
		
		return 0;
	}
	
	
	
}
