package com.dit.dsa.recursion;

public class Pattern4 {
	
	public static void printSpace(int noOfSpaces)
	{
		if(noOfSpaces == 0)
		{
			return;
		}
		
		System.out.print(" ");
		printSpace(noOfSpaces - 1);
	}
	
	public static void printStar(int noOfStar) {
		
		if(noOfStar == 0)
		{
			return;
		}
		
		System.out.print("*");
		noOfStar = noOfStar - 1;
		printStar(noOfStar);
	}
	
	public static void printPattern(int rows, int currentRow)
	{
		if(rows == 0)
		{
			return;
		}
		
		//print space
		printSpace(rows - 1);
		printStar(currentRow); // print row
		
		System.out.println(); // move to the next line
		printPattern(rows - 1, currentRow + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printPattern(5, 1);

	}

}
