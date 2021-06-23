package com.dit.dsa.recursion;

public class PalindromeString {
	
	public static boolean palRecursive(String str, int start, int last)
	{
		//base case
		if(start == last)
		{
			return true;
		}
		
		if(str.charAt(start) != str.charAt(last)) {
			return false;
		}
		
		if(start < last + 1)
		{
			return palRecursive(str, start + 1, last - 1);
		}
		
		return true;
	}
	
	public static boolean checkPalindrome(String str)
	{
		int n = str.length();
		
		if(n == 0)
		{
			return true;
		}
		
		return palRecursive(str, 0, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "malayalam";
		
		if(checkPalindrome(str))
		{
			System.out.println("Yes, Palindrome");
		}
		else {
			System.out.println("No, Palindrome");
		}

	}

}
