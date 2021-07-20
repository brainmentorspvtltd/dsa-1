package com.dit.dsa.bitmanipulation;

public class OneOddNumber {
	
	public static int oneOddOccur(int arr[], int n)
	{
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			result ^= arr[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 4, 5, 5, 4, 3};
		
		System.out.println(oneOddOccur(arr, arr.length));
		
	}

}
