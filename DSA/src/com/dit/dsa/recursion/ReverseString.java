package com.dit.dsa.recursion;

public class ReverseString {
	
	public static void reverse(String str)
	{
		if(str == null || str.length() <= 1)
		{
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Dsa Example";
		
		reverse(str);		
		
	}

}
