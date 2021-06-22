package com.dit.dsa.recursion;

public class CountZeroesDigit {
	
	public static int zeroCount(int num, int c)
	{
		if(num == 0)
		{
			return c;
		}
		
		if(num % 10 == 0) // 100200
		{
			c++; // 1, 2, 3, 4
		}
		
		return zeroCount(num / 10, c); // num = 10020, 1002, 100, 10, 1, 0
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(zeroCount(100200, 0));

	}

}
