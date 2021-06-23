package com.dit.dsa.recursion;

public class Pattern8 {

	public static int printChar(int noOfChars, int charAscii)
	{
		if(noOfChars == 0)
		{
			return charAscii;
		}
		
		System.out.print((char)(64+charAscii));
		noOfChars = noOfChars - 1;
		return printChar(noOfChars, charAscii + 1);
	}
	
	public static void printPattern(int rows, int currentRow, int current)
	{
		if(rows == 0)
		{
			return;
		}
		
		current = printChar(currentRow, current); //print row
		
		System.out.println();
		printPattern(rows - 1, currentRow + 1, current);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern(5, 1, 1);

	}

}
