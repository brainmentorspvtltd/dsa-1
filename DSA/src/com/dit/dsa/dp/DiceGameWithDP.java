package com.dit.dsa.dp;

public class DiceGameWithDP {
	
	public static int countWaysWithDP(int currentValue, int endValue, int cache[])
	{
		if(currentValue == endValue)
		{
			return 1;
		}
		
		if(currentValue > endValue)
		{
			return 0;
		}
		
		if(cache[currentValue] != 0)
		{
			return cache[currentValue];
		}
		
		int count = 0;
		
		for(int dice = 1; dice <= 6; dice++)
		{
			count = count + countWaysWithDP(currentValue + dice, endValue, cache);
		}
		
		cache[currentValue] = count;
		
		return cache[currentValue];
		//return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		System.out.println(countWaysWithDP(0, n, new int[n + 1]));
		
	}

}
