package com.dit.dsa.recursion;

import java.util.ArrayList;

public class PermutationString {
	
	public static ArrayList<String> getPermutation(String str)
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
		ArrayList<String> temp = getPermutation(remainingString);
		
		for(String t : temp)
		{
			for(int i = 0; i <= t.length(); i++)
			{
				StringBuffer sb = new StringBuffer(t);
				sb.insert(i, currentChar);
				result.add(sb.toString());
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		
		ArrayList<String> results = getPermutation(str);
		
		for(String i : results)
		{
			System.out.print(i+ " ");
		}
		
	}

}
