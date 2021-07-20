package com.dit.dsa.bitmanipulation;

public class CountSetBits {
	
	public static int countSetBits(int n)
	{
		int count = 0;
		
		while(n > 0)
		{
			n = n & (n - 1);
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int n = 10; // 1010 = 2

		System.out.println("Set bit count is "+countSetBits(n));
	}
}
