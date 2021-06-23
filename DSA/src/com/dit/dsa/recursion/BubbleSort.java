package com.dit.dsa.recursion;

public class BubbleSort {
	
	public static void bubbleSort(int arr[], int first, int last)
	{
		//base case
		if(last == 0)
		{
			return;
		}
		
		if(first == last)
		{
			bubbleSort(arr, 0, last - 1);
			return;
		}
		
		if(arr[first] > arr[first + 1]) {
			int temp = arr[first];
			arr[first] = arr[first + 1];
			arr[first + 1] = temp;
		}
		
		bubbleSort(arr, first+1, last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 4, 2};
		
		bubbleSort(arr, 0, arr.length - 1);
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}

	}

}
