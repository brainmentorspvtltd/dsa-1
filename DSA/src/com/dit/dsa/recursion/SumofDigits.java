package com.dit.dsa.recursion;

public class SumofDigits {
	
	public static int calculateSum(int n) // n = 3
	{
		if(n == 1) // Base Case / Stop Condition
		{
			return n;
		}
		
		int sum = 0;
		
		sum = n + calculateSum(n - 1); //Processing Logic // calculateSum(n - 1) - Small problem
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3: 1 + 2 + 3 = 6
		
		int k;
		
		k = calculateSum(3);
		
		System.out.println("sum of digits "+k);

	}

}
