package com.dit.dsa.recursion;

public class SubsequencePrint {
	
	public static void printSubSequence(String str, String result) {
		
		if(str.length() == 0)
		{
			System.out.print(result);
			return;
		}
		
		char singleChar = str.charAt(0);
		String remainingString = str.substring(1);
		
		printSubSequence(remainingString, result);
		
		printSubSequence(remainingString, result + singleChar);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSubSequence("abc", " ");

	}

}
