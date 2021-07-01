package com.dit.dsa.dp;

public class LISProblem {
	
	public static int lis(int arr[], int n)
	{
		int lis[] = new int[n];
		int i, j, max = 0;
		
		//Initialize LIS values for all indexes
		for(i = 0; i < n; i++)
		{
			lis[i] = 1;
		}
		
		//Compute optimized LIS values in bottom up manner
		for(i = 1; i < n; i++)
		{
			for(j = 0; j < i; j++)
			{
				if(arr[i] > arr[j] && lis[i] < lis[j] + 1)
				{
					lis[i] = lis[j] + 1;
				}
			}
		}
		
		//pick maximum of all LIS values
		for(i = 0; i < n; i++)
		{
			if(max < lis[i])
			{
				max = lis[i]; // 1
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// DP - Tabulation
		
		int arr[] = {5, 3, 0, 1, 2, 4};
		
		int result = lis(arr, arr.length);
		
		System.out.println(result);
	}

}
