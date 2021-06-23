package com.dit.dsa.recursion;

public class CapatalizeString {
	
	public static String capString(String str, boolean capatalize)
	{
		if(str.length() == 0)
		{
			return "";
		}
		
		String txt = str.substring(0, 1);
		
		if(capatalize)
		{
			return txt.toUpperCase() + capString(str.substring(1), txt.equals(" "));
		}
		else {
			return txt.toLowerCase() + capString(str.substring(1), txt.equals(" "));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "dsa example";		
		System.out.println(capString(str, true));
	}
}
