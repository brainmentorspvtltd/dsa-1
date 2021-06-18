package com.dit.dsa.string;

public class StringRotation {
	
	public static boolean checkRotations(String str1, String str2)
	{
		return ((str1.length() == str2.length()) && (str1 + str1).indexOf(str2) != -1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "AACD";
		String str2 = "ACDA";
		
		//str1 + str1 = "AACDAACD";
		
		if(checkRotations(str1, str2))
		{
			System.out.println("Strings are rotation of each other");
		}
		else {
			System.out.println("Strings are not rotation of each other");
		}
	}
}
