package com.dit.dsa.dp;

public class EditDistanceRecursive {
	
	public static int edit(String first, String second, int m, int n)
	{
		//base case
		/*
		 * If first string is empty, the only option is to insert all the characters of second string into first
		 * */
		if(m == 0)
		{
			return n;
		}
		
		/*
		 * If second string is empty, the only option is to insert all the characters of first string into second
		 * */
		if(n == 0)
		{
			return m;
		}
		
		
		if(first.charAt(m - 1) == second.charAt(n - 1))
		{
			return edit(first, second, m-1, n-1);
		}
		
		int insert = edit(first, second, m, n - 1);
		int delete = edit(first, second, m - 1, n);
		int replace = edit(first, second, m-1, n-1);
		
		int min = Math.min(insert, delete);
		return 1 + Math.min(min, replace);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = edit("sunday", "saturday", "sunday".length(), "saturday".length());
		
		System.out.println("Min Operations "+result);

	}

}
