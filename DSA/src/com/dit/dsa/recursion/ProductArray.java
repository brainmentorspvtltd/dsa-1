package com.dit.dsa.recursion;

public class ProductArray {
	
	public static int mul(int arr[], int n)
	{
		//base case 
		if(n == 0)
		{
			return arr[n];
		}
		else {
			return (arr[n] * mul(arr, n - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4};
		
		System.out.println(mul(arr, arr.length-1));
		
	}

}
