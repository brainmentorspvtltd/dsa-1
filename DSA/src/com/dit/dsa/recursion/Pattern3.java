package com.dit.dsa.recursion;

public class Pattern3 {
	
	public static void printDigit(int noOfDigit, int digit)
	{
		//Base Case
		if(noOfDigit == 0)
		{
			return;
		}
		System.out.print(digit);
		noOfDigit = noOfDigit - 1;
		printDigit(noOfDigit, digit);
	}
	
	public static void printPattern(int rows, int currentRow)
	{
		if(rows == 0)
		{
			return;
		}
		
		printDigit(currentRow, currentRow); // print row
		
		System.out.println();
		printPattern(rows - 1, currentRow + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern(5, 1);

	}

}
