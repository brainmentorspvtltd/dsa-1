package com.dit.dsa.backtracking;

import java.util.ArrayList;

public class PhoneCombinationProblem {
	
	static String keyPadArray[] = {"",".+-","abc","def","ghi"}; // key pad combination from 1 - 9 or 2 - 9
	
	public static ArrayList<String> keyPad(String phoneNumber)
	{
		//Termination Case
		if(phoneNumber.length() == 0)
		{
			ArrayList<String> combination = new ArrayList<>();
			combination.add("");
			return combination;
		}
		
		
		//Get the first digit of a number
		char first = phoneNumber.charAt(0);
		String remPhoneNumber = phoneNumber.substring(1);
		int index = first - '0';
		
		String keyPadKey = keyPadArray[index]; // abc , def
		
		ArrayList<String> result = new ArrayList<>();
		
		for(int i = 0; i < keyPadKey.length(); i++)
		{
			char currentChar = keyPadKey.charAt(i); // a, b, c
			ArrayList<String> temp = keyPad(remPhoneNumber); // d, e, f
			
			for(String t : temp)
			{
				result.add(currentChar + t);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(keyPad("23"));

	}

}
