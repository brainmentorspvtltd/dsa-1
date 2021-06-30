package com.dit.dsa.dp;

public class MinCostPathRecursive {
	
	public static int min(int x, int y, int z)
	{
		/*
		if(x < y && x < z)
		{
			return x;
		}
		else if(y < z)
		{
			return y;
		}
		else {
			return z;
		}*/
		
		if(x < y)
		{
			return (x < z) ? x : z;
		}
		else {
			return (y < z) ? y : z;
		}
	}
	
	public static int minCost(int cost[][], int m, int n)
	{
		if(n < 0 || m < 0)
		{
			return Integer.MAX_VALUE;
		}
		else if(m == 0 && n == 0)
		{
			return cost[m][n];
		}
		else {
			return cost[m][n] + min(minCost(cost, m - 1, n),
									minCost(cost, m, n - 1),
									minCost(cost, m - 1, n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
						{1, 2, 3},
						{4, 8, 2},
						{1, 5, 3}
		};
		
		System.out.println(minCost(matrix, 2, 2));

	}

}
