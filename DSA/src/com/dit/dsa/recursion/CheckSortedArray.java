package com.dit.dsa.recursion;

public class CheckSortedArray {
	
	public static boolean isSorted(int arr[], int index) // index - 0
	{
		boolean result;
		
		if(arr.length-1 == index)
		{
			return true;
		}
		
		if(arr[index] > arr[index+1])
		{
			return false;
		}
		else {
			
			result = isSorted(arr, index + 1); // index - 1, 2
		}
		
		return  result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 4, 3};
		
		boolean result = isSorted(arr, 0);
		
		System.out.println(result);
		
	}

}
