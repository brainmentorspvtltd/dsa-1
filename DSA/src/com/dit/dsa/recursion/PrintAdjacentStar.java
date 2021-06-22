package com.dit.dsa.recursion;

public class PrintAdjacentStar {
	
	static String result = "";
	
	public static void printStar(String str, int i)
	{
		result += str.charAt(i);
		
		if(i == str.length() - 1)
		{
			return;
		}
		
		if(str.charAt(i) == str.charAt(i+1)) {
			result += '*';
		}
		
		printStar(str, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Leetcode";
		printStar(str, 0);
		
		System.out.println(result);

	}

}
