package com.dit.dsa.recursion;

import java.util.ArrayList;

public class SubSequence {
	
	public static ArrayList<String> subSequence(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> emptyString = new ArrayList<>();
			emptyString.add("");
			return emptyString;
		}
		
		char currentChar = str.charAt(0);
		String remainingString = str.substring(1);
		ArrayList<String> result = new ArrayList<>();
		ArrayList<String> temp = subSequence(remainingString);
		
		for(String i : temp)
		{
			result.add(i);
			//System.out.println(result);
			result.add(currentChar + i);
			//System.out.println(result);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		System.out.println(subSequence(str));
		
		//Total subsequence is 2 ^ N(N is the length of the String) = 2 ^ 3 = 8

	}

}
