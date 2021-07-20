package com.dit.dsa.bitmanipulation;

public class TwoOddNumbers {
	
	public static void findTwoOddNums(int arr[], int n)
	{
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			result ^= arr[i]; // 7
		}
		
		//System.out.println(result);
		
		int setBit = result & (~(result - 1));  // 1
		
		/* 7 - 0111 , 6- 0110 = (~6)
						~1001 = 9	
								
			0111
			1001
			0001 - 1
		*/
		
		int x = 0, y = 0;
		
		for(int i = 0; i < n; i++)
		{
			if((arr[i] & setBit) != 0)
			{
				x = x ^ arr[i];
			}
			else {
				y = y ^ arr[i];
			}
		}
		
		System.out.println(x + " " + y);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 3, 3, 4, 4, 5};
		
		findTwoOddNums(arr, arr.length);
	}

}
