package com.dit.dsa.dp;

public class MinCostPathTabulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
				{1, 2, 3},
				{4, 8, 2},
				{1, 5, 3}
			};

		int result[][] = new int[matrix.length][matrix.length];
		
		result[0][0] = matrix[0][0]; // fill the first value like base case
		
		//first fill the left col
		for(int i = 1; i < result.length; i++)
		{
			result[i][0] =  result[i - 1][0] + matrix[i][0];
		}
		
		//now fill the first row
		for(int i = 1; i < result.length; i++)
		{
			result[0][i] = result[0][i - 1] + matrix[0][i];
		}
		
		//Now compute rest of the cells based on top row and left col
		for(int i = 1; i < result.length; i++)
		{
			for(int j = 1; j < result.length; j++)
			{
				result[i][j] = Math.min(Math.min(result[i - 1][j - 1], result[i - 1][j]), result[i][j - 1]) + matrix[i][j];
			}
		}
		
		System.out.println(result[result.length-1][result.length-1]);

	}

}
