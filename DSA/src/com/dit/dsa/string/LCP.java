package com.dit.dsa.string;

import java.util.Arrays;

public class LCP {
	
	public static String longestCommonPrefix(String[] str)
	{
		int n = str.length;
		
		if(n == 0)
		{
			return "";
		}
		
		if(n == 1)
		{
			return str[0];
		}
		
		Arrays.sort(str);
		
		int minLength = Math.min(str[0].length(), str[n - 1].length());
		
		int i = 0; 
		while(i < minLength && str[0].charAt(i) == str[n - 1].charAt(i)) {
			i++;
		}
		
		String prefix = str[0].substring(0, i);
		return prefix;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input[] = {"leetcode", "lean"};
		System.out.println("The LCP is "+longestCommonPrefix(input));
	}

}
