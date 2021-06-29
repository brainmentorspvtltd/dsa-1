package com.dit.dsa.dp;

public class FibonacciSeriesDP {
	
	public static int fib(int n, int cache[])
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		if(cache[n] != 0)
		{
			return cache[n];
		}
		
		int first = fib(n - 1, cache);
		int second = fib(n - 2, cache);
		int sum = first + second;
		
		cache[n] = sum;
		
		return cache[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nthTerm = 10;
		
		int cache[] = new int[nthTerm + 1];
		
		System.out.println(fib(nthTerm, cache));

	}

}
