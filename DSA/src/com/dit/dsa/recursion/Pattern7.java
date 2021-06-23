package com.dit.dsa.recursion;

public class Pattern7 {
	
	public static void printChar(int noOfChars, int charAscii)
	{
		if(noOfChars == 0)
		{
			return;
		}
		
		System.out.print((char)(64+charAscii));
		noOfChars = noOfChars - 1;
		printChar(noOfChars, charAscii);
	}
	
	public static void printPattern(int rows, int currentRow)
	{
		if(rows == 0)
		{
			return;
		}
		
		printChar(currentRow, currentRow); //print row
		
		System.out.println();
		printPattern(rows - 1, currentRow + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern(5, 1);

	}

}
