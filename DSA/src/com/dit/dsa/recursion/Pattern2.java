package com.dit.dsa.recursion;

public class Pattern2 {
	
	public static void pattern(int n, int i)
	{
		if(n < 1)
		{
			return;
		}
		
		if(i <= n)
		{
			System.out.print("*");
			pattern(n, i+1);
		}
		else {
			System.out.print(" "+"\n");
			pattern(n - 1, 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pattern(5, 1);

	}

}
