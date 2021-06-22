package com.dit.dsa.recursion;

public class SearchElementArray {
	
	public static int searchElement(int arr[], int l, int r, int s)
	{
		if(l > r) {
			return -1;
		}
		
		if(arr[l] == s)
		{
			return l;
		}
		
		if(arr[r] == s)
		{
			return r;
		}
		
		return searchElement(arr, l + 1, r - 1, s)	;	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 34, 54, 23, 18};
		int search = 23; // 3
		
		int i = searchElement(arr, 0, arr.length-1, search);
		
		if(i != -1)
			System.out.println("Search Element's Index "+i);
		else 
			System.out.println("Search element is not found");
		
	}

}
