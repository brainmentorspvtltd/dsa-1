package com.dit.dsa.recursion;

public class StackBuilding {
	
	public static void stackBuilding(int value)
	{
		if(value == 0) // base case
		{
			return;
		}
		
		System.out.print(value+" ");
		stackBuilding(value - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackBuilding(5);
		//print 5 to 1 using recursion - Stack Building

	}

}
