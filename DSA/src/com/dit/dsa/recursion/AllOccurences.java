package com.dit.dsa.recursion;

public class AllOccurences {
	
	public static int[] allIndices(int arr[], int s, int i)
	{
		if(i == arr.length)
		{
			int result[] = new int[0]; // empty array
			return result;
		}
		
		int index[] = allIndices(arr, s, i + 1);
		
		if(arr[i] == s)
		{
			int result2[] = new int[index.length+1];  
		
			result2[0] = i;
			
			for(int j = 0; j < index.length; j++)
			{
				result2[j + 1] = index[j];
			}
			
			return result2;
		}
		
		else {
			return index;
		}
	}
	
	public static int[] searchAllIndexes(int arr[], int s)
	{
		return allIndices(arr, s, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 2, 2, 5};
		int search = 2;
		
		int result[] = searchAllIndexes(arr, search);
		
		for(int i : result)
		{
			System.out.print(i+" ");
		}

	}

}
