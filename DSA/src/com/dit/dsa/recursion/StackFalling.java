package com.dit.dsa.recursion;

public class StackFalling {
	
	public static void stackFalling(int value)
	{
		if(value == 0) // base case
		{
			return;
		}
		
		stackFalling(value - 1); // 4 3 2 1 0
		System.out.print(value+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackFalling(5);
		//print 5 to 1 using recursion - Stack Building

	}

}
