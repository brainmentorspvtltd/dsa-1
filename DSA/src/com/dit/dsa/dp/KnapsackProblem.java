package com.dit.dsa.dp;

public class KnapsackProblem {
	
	public static int knapSack(int values[], int weights[], int max, int index)
	{
		if(index == weights.length || max == 0)
		{
			return 0;
		}
		
		if(weights[index] > max)
		{
			return knapSack(values, weights, max, index + 1);
		}
		else {
			int option1 = values[index] + knapSack(values, weights, max - weights[index], index + 1);
			
			//
			int option2 = knapSack(values, weights, max, index + 1);
			
			return Math.max(option1, option2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int values[] = {60, 100, 120};
		int weights[] = {1, 2, 2};
		
		int maxWeight = 3;
		
		int result = knapSack(values, weights, maxWeight, 0);
		
		System.out.println(result);

	}

}
