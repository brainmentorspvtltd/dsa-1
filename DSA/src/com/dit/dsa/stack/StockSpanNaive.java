package com.dit.dsa.stack;

public class StockSpanNaive {
	
	public static void calculate(int price[], int n, int S[])
	{
		S[0] = 1;
		
		for(int i = 1; i < n; i++)
		{
			S[i] = 1;
			for(int j = i - 1; j >= 0 && price[i] >= price[j]; j--)
			{
				S[i]++;
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(S[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int price[] = {100, 80, 60, 70, 60, 75, 85};
		int n = price.length;
		int S[] = new int[n];
		
		calculate(price, n, S);
		

	}

}
