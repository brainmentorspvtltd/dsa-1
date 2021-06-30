package com.dit.dsa.dp;

public class SubsetSumTabulation {
	
	public static boolean subsetSum(int set[], int n, int sum)
	{
		boolean subset[][] = new boolean[n + 1][sum + 1];
		
		//if sum is 0 then answer is true
		for(int i = 0; i <= n; i++) {
			subset[i][0] = true;
		}
		
		//if sum is not 0, then answer is false
		for(int i = 1; i <= sum; i++)
		{
			subset[0][i] = false;
		}
		
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= sum; j++)
			{
				//col- sum value is less than the current value of set
				if(j < set[i - 1])
				{
					subset[i][j] = subset[i - 1][j]; // carry the previous row value
				}
				
				//col- sum value is greater than the current value of set
				if(j >= set[i - 1])
				{
					subset[i][j] = subset[i - 1][j] || subset[i - 1][j - set[i - 1]]; // carry the curremt row value
				}
			}
		}
		
		return subset[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int set[] = {2, 1, 3, 5};
		int sum = 4;
		
		if(subsetSum(set, set.length, sum) == true)
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}

}
