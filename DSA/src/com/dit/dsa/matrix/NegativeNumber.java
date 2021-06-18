package com.dit.dsa.matrix;

public class NegativeNumber {
	
	public static int count(int matrix[][])
	{
		//m * n matrix
		int m = matrix.length;
		int n = matrix[0].length;
		int negative = 0;
		
		int i = 0, j = n - 1;
		
		while(i <= m-1 && j >= 0)
		{
			if(matrix[i][j] < 0)
			{
				negative += j + 1;
				i++;
			}
			else {
				j--;
			}
		}
		
		return negative;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//output - 6
		int matrix[][] = {
						{-7, -3, -1, 3, 5},
						{-3, -2, 2, 4, 6},
						{-1, 1, 3, 5, 8},
						{3, 4, 7, 8, 9}
						};

		System.out.println("Negative Numbers are "+count(matrix));
		
	}

}
