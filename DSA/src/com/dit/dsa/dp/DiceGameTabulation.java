package com.dit.dsa.dp;

public class DiceGameTabulation {
	
	public static int tabulation(int start, int end)
	{
		int cache[] = new int[end + 1];
		cache[end]  = 1;
		
		for(int i = end - 1; i >= 0; i--)
		{
			int count = 0;
			
			for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++)
			{
				count += cache[dice + i];
			}
			
			cache[i] = count;
		}
		
		return cache[start];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(tabulation(0, 10));

	}

}
