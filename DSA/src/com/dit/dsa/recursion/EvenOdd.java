package com.dit.dsa.recursion;

public class EvenOdd {
	
	public static void evenOdd(int value)
	{
		if(value == 0)
		{
			return;
		}
		
		//even
		if(value % 2 == 0)
		{
			System.out.print(value+" ");
		}
		
		evenOdd(value - 1);
		
		//odd
		if(value % 2 != 0)
		{
			System.out.print(value+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		evenOdd(10);

	}

}
