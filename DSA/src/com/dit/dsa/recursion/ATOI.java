package com.dit.dsa.recursion;

public class ATOI {
	
	public static int getAtoi(String str, int n) {
		
		//base case
		if(n == 1)
		{
			return str.charAt(0) - '0';
		}
		
		//multiply the result with 10 and add the value to last digit
		
		return (10 * getAtoi(str, n - 1) + str.charAt(n - 1) - '0');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "400";
		int n = str.length();
		
		System.out.println(getAtoi(str, n));

	}

}
