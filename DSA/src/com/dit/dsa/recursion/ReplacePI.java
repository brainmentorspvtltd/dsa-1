package com.dit.dsa.recursion;

public class ReplacePI {
	
	public static String replacePI(String str)
	{
		if(str.length() <= 1)
		{
			return str;
		}
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i' && str.length() >= 2)
		{
			return "3.14" + replacePI(str.substring(2, str.length()));
		}
		
		return str.charAt(0) + replacePI(str.substring(1, str.length()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abpiab";
		System.out.println(replacePI(str));

	}

}
