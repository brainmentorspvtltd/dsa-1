package com.dit.dsa.recursion;

public class Pattern6 {
	
	public static int printDigit(int noOfDigit, int digit)
	{
		if(noOfDigit == 0)
		{
			return digit;
		}
		
		System.out.print(digit);
		noOfDigit = noOfDigit - 1;
		return printDigit(noOfDigit, digit+1);
	}
	
	public static void printPattern(int rows, int currentRow, int startDigit)
	{
		if(rows == 0)
		{
			return;
		}
		
		startDigit = printDigit(currentRow, startDigit); // print row
		
		System.out.println(); // move to the next line
		printPattern(rows - 1, currentRow + 1, startDigit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int startDigit = 1;
		
		printPattern(5, 1, startDigit);

	}

}
